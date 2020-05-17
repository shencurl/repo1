package Leetcode;

public class 分割等和子集 {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int target=0;
        for (int num:nums){
            sum+=num;
        }
        //奇数不满足
        if ((sum&1)==1) return false;
        else target=sum/2;
        //因为只要用到dp[i]是否为true，所以不需要二维数组,二维数组记录了true和false所有结果。
        boolean[] dp=new boolean[target+1];
        //
        if (nums[0]<=target) {
            dp[0]=true;
        }
        //一行一行填表，从第一个数字开始，看看target满不满足，后面的数字可以利用前面的数字，并且dp不断更新
        for (int i=1;i<nums.length;i++){
            //要从大到小才能不断往前缩短范围
            for (int j=target;j>=nums[i];j--){
                //如果已经找到了直接返回
                if (dp[target])return true;
                //dp不是按顺序的而是随着i增大，不断确定，根据num[i]用或者不用得到下面dp，我们只需要记下能放下的结果，对于false不管它
                dp[j]=dp[j]||dp[j-nums[i]];

            }
        }
        return dp[target];
    }
}
