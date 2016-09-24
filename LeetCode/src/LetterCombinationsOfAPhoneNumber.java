import java.util.ArrayList;
import java.util.List;
/*17. Letter Combinations of a Phone Number  QuestionEditorial Solution  My Submissions
Total Accepted: 97296
Total Submissions: 318064
Difficulty: Medium
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.



Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].*/
public class LetterCombinationsOfAPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCombinations("345"));
	}
    public static List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<String>();
        if(digits==null||digits.length()==0||digits.contains("0")||digits.contains("1")){
            return result;
        }
        String[] map=new String[10];
        map[0]="";
        map[1]="";
        map[2]="abc";
        map[3]="def";
        map[4]="ghi";
        map[5]="jkl";
        map[6]="mno";
        map[7]="qprs";
        map[8]="tuv";
        map[9]="wxyz";
        StringBuilder sb=new StringBuilder();
        backtrack(sb,digits,map,result,0);
        return result;
        
    }
    
    public static void backtrack(StringBuilder sb,String digits,String[] map,List<String> result,int start){
        if(sb.length()==digits.length()){
            result.add(sb.toString());
            return;
        }
        for(int i=start;i<digits.length();i++){
        	//test 34
        	int tt=Character.getNumericValue(digits.charAt(i));
            for(int j=0;j<map[tt].length();j++){
                sb.append(map[tt].charAt(j));
                backtrack(sb,digits,map,result,i+1);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
