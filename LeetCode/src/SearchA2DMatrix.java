
public class SearchA2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{1},{3}};
		int target=3;
		System.out.println(searchMatrix(matrix, target));
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        //First compare with first element in each row using binary search. Thus we get the row the target will be at.
        //Then use binary search to locate the position in that row.
        if(matrix==null||matrix.length==0||target<matrix[0][0]||target>matrix[matrix.length-1][matrix[0].length-1]){
            return false;
        }
        int top=0,bottom=matrix.length-1,targetRow=0;
            while(top+1<bottom){
                int mid=top+(bottom-top)/2;
                if(matrix[mid][0]==target){
                    return true;
                }else if(matrix[mid][0]>target){
                    bottom=mid;
                }else{
                    top=mid;
                }
            }
            if(target>=matrix[top][0]){
                targetRow=top;
            }else if(target>=matrix[bottom][0]){
                targetRow=bottom;
            }else{
                return false;
            }
        
        int left=0,right=matrix[targetRow].length-1;
        while(left+1<right){
            int mid=left+(right-left)/2;
            if(matrix[targetRow][mid]==target){
                return true;
            }else if(matrix[targetRow][mid]<target){
                left=mid;
            }else{
                right=mid;
            }
        }
        if (matrix[targetRow][left] == target) {
            return true;
        } else if (matrix[targetRow][right] == target) {
            return true;
        }
        return false;
    }
}
