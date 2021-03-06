import java.util.ArrayList;
import java.util.List;

/*54. Spiral Matrix  QuestionEditorial Solution  My Submissions
Total Accepted: 69603
Total Submissions: 295418
Difficulty: Medium
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].*/

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{2,3}};
		System.out.println(spiralOrder(matrix));
	}
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result=new ArrayList<Integer>();
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return result;
        }
        int rowStart=0,rowEnd=matrix.length-1,colStart=0,colEnd=matrix[0].length-1;
        while(rowStart<=rowEnd&&colStart<=colEnd){
            //going right
            for(int i=colStart;i<=colEnd;i++){
                result.add(matrix[rowStart][i]);
            }
            rowStart++;
            
            //going down
            for(int i=rowStart;i<=rowEnd;i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            //going left
            //if(rowEnd>=rowStart){
                for(int i=colEnd;i>=colStart;i--){
                    result.add(matrix[rowEnd][i]);
                }
            //}
            rowEnd--;
            
            //going up
            //if(colEnd>=colStart){
                for(int i=rowEnd;i>=rowStart;i--){
                    result.add(matrix[i][colStart]);
                }
            //}
            colStart++;
        }
        return result;
	}
}
