package Leetcode;

public class 乘积最大子数组 {
   public int maxProduct(int[] nums) {
        int max= Integer.MIN_VALUE;
        int[]dp=new int[nums.length];
        for (int i=0;i<nums.length;i++){
                dp[i]=nums[i];
                int tem=nums[i];
            for (int j=i+1;j<nums.length;j++){
                tem=tem*nums[j];
                dp[i]=Math.max(dp[i],tem);
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }

    /*public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int[] dpMax = new int[n];
        dpMax[0] = nums[0];
        int[] dpMin = new int[n];
        dpMin[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            dpMax[i] = Math.max(dpMin[i - 1] * nums[i], Math.max(dpMax[i - 1] * nums[i], nums[i]));
            dpMin[i] = Math.min(dpMin[i - 1] * nums[i], Math.min(dpMax[i - 1] * nums[i], nums[i]));
            max = Math.max(max, dpMax[i]);
        }
        return max;
    }*/

    public int maxProduct3(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
    }
}




