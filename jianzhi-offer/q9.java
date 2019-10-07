//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

public class q9 {
    public int JumpFloorII(int target) {
        if(target == 0)return 0;
        if(target == 1)return 1;
        if(target == 2)return 2;
        int[] dp = new int[target+1];
        dp[1] = 1;
        dp[2] = 2;
        int sum = dp[1] + dp[2] + 1;
        //+1 means one step to the target
        for(int i = 3; i<=target; i++){
            dp[i] = sum;
            sum += dp[i];
        }
        return dp[target];
    }
}
