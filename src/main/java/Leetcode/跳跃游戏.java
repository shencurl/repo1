package Leetcode;

public class 跳跃游戏 {
    public boolean canJump(int[] nums) {
        //尽可能跳更远，j落到最远地方后，看i有没有跳更远的，如果i==j，意味着i到j都没有更远的，如果nums[i]还等于0说明跳不动了
        int i,j=0,len=nums.length;
        if(len<=1) return true;
        for(i=0;i<len;i++){
            if(i==j&&nums[i]==0) return false;
            j=Math.max(j,i+nums[i]);
            if(j>=len-1) return true;
        }
        return true;
    }
}
