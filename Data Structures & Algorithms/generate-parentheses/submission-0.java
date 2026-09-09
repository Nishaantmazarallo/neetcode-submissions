class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        permutation(n,0,ans,"",0,0);
        return ans;
    }
    public void permutation(int n,int index,List<String> ans,String current,int open,int close){
        if(current.length()==2*n){
            ans.add(current);
        }
        if(open<n){
             permutation(n,index+1,ans,current+"(",open+1,close);
        }
        if(close<open){
            permutation(n,index+1,ans,current+")",open,close+1);
        }
    }
}
