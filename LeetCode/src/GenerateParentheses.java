import java.util.ArrayList;
import java.util.List;
/*22. Generate Parentheses  QuestionEditorial Solution  My Submissions
Total Accepted: 105106
Total Submissions: 265619
Difficulty: Medium
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]*/
public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(3));
	}
    public static List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        if(n<1){
            return result;
        }
        backtrack(result,"",0,0,n);
        return result;
    }
    
    public static void backtrack(List<String> result,String str,int open,int close,int max){
        if(str.length()==max*2){
            result.add(str);
            return;
        }
        if(open<max){
            backtrack(result,str+"(",open+1,close,max);
        }
        if(close<open){
            backtrack(result,str+")",open,close+1,max);
        }
    }
}
