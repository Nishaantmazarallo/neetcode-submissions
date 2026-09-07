class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        subset(0,nums,ans,new ArrayList<>());
        return ans; 
    }
    public void subset(int index,int[] arr,List<List<Integer>> ans,List<Integer> current){
        ans.add(new ArrayList<>(current));
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1])continue;
            current.add(arr[i]);
            subset(i+1,arr,ans,current);
            current.remove(current.size()-1);
        }

    }
}
