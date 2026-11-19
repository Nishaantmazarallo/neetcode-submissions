class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()) return false;
       char ch[]=s.toCharArray();
       char ch2[]=t.toCharArray();
       Arrays.sort(ch);
       Arrays.sort(ch2);
       return Arrays.equals(ch,ch2);
    }
}//tc: O(n logn)
