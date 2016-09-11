/*59. Spiral Matrix II  QuestionEditorial Solution  My Submissions
Total Accepted: 61028
Total Submissions: 167211
Difficulty: Medium
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]*/
public class SpiralMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateMatrix(3));
	}
    public static int[][] generateMatrix(int n) {
        int x=1;
        int[][] result=new int[n][n];
        if(n<1){
            return result;
        }
        int colStart=0,colEnd=n-1,rowStart=0,rowEnd=n-1;
        while(colStart<=colEnd&&rowStart<=rowEnd){
            //going right
            for(int i=colStart;i<=colEnd;i++){
                result[rowStart][i]=x++;
            }
            rowStart++;
            
            //going down
            for(int i=rowStart;i<=rowEnd;i++){
                result[i][colEnd]=x++;
            }
            colEnd--;
            
            //going left
            if(rowEnd>=rowStart){
                for(int i=colEnd;i>=colStart;i--){
                    result[rowEnd][i]=x++;
                }
            }
            rowEnd--;
            
            //going up
            if(colEnd>=colStart){
                for(int i=rowEnd;i>=rowStart;i--){
                    result[i][colStart]=x++;
                }
            }
            colStart++;
        }
        return result;
    }
}
