class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean visited[]=new boolean[nums.length];
        permutation(nums,ans,new ArrayList<>(),visited);
        return ans;
    }
    public void permutation(int[] arr,List<List<Integer>> ans,List<Integer>current,boolean visited[]){
        if(current.size()==arr.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                visited[i]=true;
                current.add(arr[i]);
                permutation(arr,ans,current,visited);
                current.remove(current.size()-1);
                visited[i]=false;
            }
        }
    }
}
