
public class MaximalSquare {
	public static void main(String[] args) {
		int[][] matrix={
				{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}
		};
		System.out.println(maximalSquare(matrix));
	}
    public static int maximalSquare(int[][] matrix) {
        if(matrix==null||matrix.length==0){
            return 0;
        }
        int i=matrix.length,j=matrix[0].length;
        int result=0;
        int[][] dp=new int[i+1][j+1];
        for(int m=1;m<=i;m++){
            for(int n=1;n<=j;n++){
                if(matrix[m-1][n-1]==1){
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1])+1;
                    result=Math.max(dp[i][j],result);
                }
            }
        }
        return result*result;
    }
}
