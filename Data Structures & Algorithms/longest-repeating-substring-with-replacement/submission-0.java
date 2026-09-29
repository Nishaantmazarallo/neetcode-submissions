class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int start=0;
        int maxLen=0;
        int maxFreq=0;
        for(int right=0;right<s.length();right++){
             char ch=s.charAt(right);
             map.put(ch,map.getOrDefault(ch,0)+1);
             maxFreq=Math.max(maxFreq,map.get(ch));
             int winLen=right-left+1;
             if(winLen-maxFreq>k){
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                left++;
             }
             maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
