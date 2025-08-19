class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long v=0;
        long c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
            else{
                v+=(c*(c+1))/2;
                c=0;
            }
        }
        v+=(c*(c+1))/2;
        return v;
    }
}