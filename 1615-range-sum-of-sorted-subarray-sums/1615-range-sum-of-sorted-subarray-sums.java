class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=i;j<nums.length;j++){
                s+=nums[j];
                res.add(s);

            }
        }
        long sum=0;
        Collections.sort(res);
        for(int i=left-1;i<right;i++){
            sum+=res.get(i);
            sum%=1000000007;
        }
        return (int)sum;
        
    }
}