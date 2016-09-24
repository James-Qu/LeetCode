public class RangeSumQuery2DImmutable {
	static int[][] matrix={{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
	public static void main(String[] args) {
		RangeSumQuery2DImmutable r=new RangeSumQuery2DImmutable(matrix);
		int s=r.sumRegion(1, 2, 2, 4);
		System.out.println(s);
	}
    int[][] sum;
    public RangeSumQuery2DImmutable(int[][] matrix) {
        int row=matrix.length;
        int col=row==0?0:matrix[0].length;
        sum=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=1;j<col;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        for(int i=0;i<col;i++){
            for(int j=1;j<row;j++){
                matrix[j][i]+=matrix[j-1][i];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        //return matrix[row2][col2]-matrix[row2]
        if(col1==0&&row1!=0){
            return matrix[row2][col2]-matrix[row1-1][col2];
        }
        if(col1==0&&row1==0){
            return matrix[row2][col2];
        }
        if(col1!=0&&row1==0){
            return matrix[row2][col2]-matrix[row2][col1-1];
        }
        return matrix[row2][col2]-matrix[row1-1][col2]-matrix[row2][col1-1]+matrix[row1-1][col1-1];
    }
}