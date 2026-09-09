class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        partitioning(0,ans,new ArrayList<>(),s);
        return ans;
    }
    public void partitioning(int index,List<List<String>> ans,List<String> curr,String s){
        if(index==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                curr.add(s.substring(index,i+1));
                partitioning(i+1,ans,curr,s);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
