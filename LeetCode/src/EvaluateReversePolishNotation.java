import java.util.Stack;

public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] t={"3","-4","+"};
		System.out.println(evalRPN(t));
	}
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        while(i<tokens.length){
            //if it is a number
            if(check(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                if(stack.size()<2){
                    return Integer.MIN_VALUE;
                }
                int a=stack.pop();
                int b=stack.pop();
                switch(tokens[i]){
                    case "+":stack.push(a+b);break;
                    case "-":stack.push(b-a);break;
                    case "*":stack.push(b*a);break;
                    case "/":stack.push(b/a);break;
                }
            }
            i++;
        }
        return stack.pop();
    }
    
    private static boolean check(String s){
    	if(s.startsWith("-")&&s.length()>1){
    		s=s.substring(1);
    	}
        return s.matches("[0-9]+");
    }
}
