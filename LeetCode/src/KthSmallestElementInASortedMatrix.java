import java.util.Arrays;
/*378. Kth Smallest Element in a Sorted Matrix  QuestionEditorial Solution  My Submissions
Total Accepted: 2550
Total Submissions: 6431
Difficulty: Medium
Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.

Example:

matrix = [
   [ 1,  5,  9],
   [10, 11, 13],
   [12, 13, 15]
],
k = 8,

return 13.
Note: 
You may assume k is always valid, 1 ¡Ü k ¡Ü n2.*/

public class KthSmallestElementInASortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{1,5,9},{10,11,13},{12,13,15}};
		System.out.println(kthSmallest(matrix, 8));
	}
    public static int kthSmallest(int[][] matrix, int k) {
        int[] arr=new int[matrix.length*matrix.length];
        for(int i=0,m=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[m++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
