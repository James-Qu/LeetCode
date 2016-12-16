import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins={1,2,3};
		System.out.println(coinChange(coins, 18));
	}
    public static int coinChange(int[] coins, int amount) {
        if(amount<=0){
            return 0;
        }
        int[] dp=new int[amount+1];
        
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                	boolean temp=dp[i-coins[j]]+1<dp[i];
                    dp[i]=Math.min(dp[i-coins[j]]+1,dp[i]);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
}
}
