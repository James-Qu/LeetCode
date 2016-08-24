import java.util.Stack;

/*20. Valid Parentheses  QuestionEditorial Solution  My Submissions
Total Accepted: 122193
Total Submissions: 402368
Difficulty: Easy
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid 
but "(]" and "([)]" are not.*/
public class ValideParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean isValid(String s) {
        if(s==null||s.isEmpty()){
            return true;
        }
        if(s.length()==1){
            return false;
        }
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'&&!stack.isEmpty()&&stack.peek()=='('){
                stack.pop();
            }else if(s.charAt(i)=='}'&&!stack.isEmpty()&&stack.peek()=='{'){
                stack.pop();
            }else if(s.charAt(i)==']'&&!stack.isEmpty()&&stack.peek()=='['){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
