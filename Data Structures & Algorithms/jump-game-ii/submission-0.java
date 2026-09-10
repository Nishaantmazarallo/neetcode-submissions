class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int maxIndex=0;
        int currentEnd=0;
        for(int i=0;i<nums.length-1;i++){
            maxIndex=Math.max(maxIndex,i+nums[i]);
            if(i==currentEnd){
                jump++;
                currentEnd=maxIndex;
            }
            if(currentEnd<=i) return -1;
        }
        return jump;
    }
}
