public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int curSum=0;
        for(int i=0;i<nums.length;i++){
            curSum=Math.max(nums[i],curSum+nums[i]);
            maxSum=Math.max(maxSum,curSum);
        }
        return maxSum;
    }
}
    

