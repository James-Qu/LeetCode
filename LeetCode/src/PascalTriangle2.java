import java.util.ArrayList;
import java.util.List;

/*119. Pascal's Triangle II  QuestionEditorial Solution  My Submissions
Total Accepted: 83415
Total Submissions: 250054
Difficulty: Easy
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?*/
public class PascalTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        //if(rowIndex==0){
       //     return result;
       // }
        List<Integer> row0=new ArrayList<Integer>();
        row0.add(1);
        result.add(row0);
        if(rowIndex==0){
            return row0;
        }
        
        List<Integer> row1=new ArrayList<Integer>();
        row1.add(1);
        row1.add(1);
        result.add(row1);
        if(rowIndex==1){
            return row1;
        }
        
        int i=2;
        while(i<=rowIndex){
            List<Integer> lastRow=result.get(i-1);
            List<Integer> row=new ArrayList<Integer>();
            row.add(0,1);
            //row.add(i,1);
            for(int n=1;n<i;n++){
                row.add(n,lastRow.get(n-1)+lastRow.get(n));
            }
            row.add(1);
            result.add(row);
            i++;
        }
        return result.get(rowIndex);
    }
}
