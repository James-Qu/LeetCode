/*64. Minimum Path Sum  QuestionEditorial Solution  My Submissions
Total Accepted: 82076
Total Submissions: 227087
Difficulty: Medium
Given a m x n grid filled with non-negative numbers, 
find a path from top left to bottom right which minimizes the sum of all 
numbers along its path.*/
public class MinimumPathSum {
	public static void main(String[] args) {
		int[][] grid={{1,3},{4,6},{2,5}};
		System.out.println(minPathSum(grid));
	}
    public static int minPathSum(int[][] grid) {
        /*
        f[m][n]=min(f[m-1][n],f[m][n-1])+g[m][n]   m>=1  n>=1
        base case:  f[0][0]=g[0][0]
        			f[0][n]=f[0][n-1]+g[0][n]                  m=0   n>=1
        			f[m][0]=f[m-1][0]+g[m][0]                   n=0  m>=1
           */
        
        if(grid==null||grid.length==0){
            return Integer.MIN_VALUE;
        }
        int sum=0;
        int m=grid.length,n=grid[0].length;
        int[][] dp=new int[m][n];
        if(m==1){
            for(int i=0;i<n;i++){
                sum+=grid[0][i];
            }
            return sum;
        }
        if(n==1){
            for(int j=0;j<m;j++){
                sum+=grid[j][0];
            }
            return sum;
        }
        dp[0][0]=grid[0][0];
        //initialize m=0
        for(int i=1;i<n;i++){
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        //initialize n=0
        for(int j=1;j<m;j++){
            dp[j][0]=dp[j-1][0]+grid[j][0];
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
