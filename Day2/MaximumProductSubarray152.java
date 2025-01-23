
public class MaximumProductSubarray152 {
        public int maxProduct(int[] nums) {
            if(nums.length==0){
             return 0;
            }
            int min=nums[0];
            int max=nums[0];
            int result=max;
            for(int i=1;i<nums.length;i++){
             int cur=nums[i];
             int temp=Math.max(cur,Math.max(cur*min,cur*max));
             min=Math.min(cur,Math.min(cur*min,cur*max));
             max=temp;
             result=Math.max(result,max);
            }
            return result;
         }
        
    }
    

