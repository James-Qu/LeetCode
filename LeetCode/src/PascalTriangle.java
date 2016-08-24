import java.util.ArrayList;
import java.util.List;
/*118. Pascal's Triangle  QuestionEditorial Solution  My Submissions
Total Accepted: 93123
Total Submissions: 268895
Difficulty: Easy
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]*/
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(numRows==0){
            return result;
        }
        List<Integer> row0=new ArrayList<Integer>();
        row0.add(1);
        result.add(row0);
        if(numRows==1){
            return result;
        }
        
        List<Integer> row1=new ArrayList<Integer>();
        row1.add(1);
        row1.add(1);
        result.add(row1);
        if(numRows==2){
            return result;
        }
        
        int i=2;
        while(i<numRows){
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
        return result;
    }
}
