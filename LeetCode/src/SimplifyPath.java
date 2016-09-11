import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/*71. Simplify Path  QuestionEditorial Solution  My Submissions
Total Accepted: 61015
Total Submissions: 264568
Difficulty: Medium
Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
click to show corner cases.

Corner Cases:
Did you consider the case where path = "/../"?
In this case, you should return "/".
Another corner case is the path might contain multiple slashes '/' together, 
such as "/home//foo/".
In this case, you should ignore redundant slashes and return "/home/foo".*/
public class SimplifyPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s="/...".split("/");
		//System.out.println(s);
		for(String str:s){
			System.out.println(str);
		}
		System.out.println(simplifyPath("/abc/..."));
	}
    public static String simplifyPath(String path) {
        if(path==null||path.length()==0){
            return path;
        }
        if(path.equals("/../")){
            return "/";
        }
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        String[] string=path.split("/");
        Stack<String> stack=new Stack();
        for(String s:string){
            if(s.equals("..")&&!stack.isEmpty()){
                stack.pop();
            }else{
                if(!skip.contains(s))
                    stack.push(s);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        String result="";
        while(!stack.isEmpty()){
            result="/"+stack.pop()+result;
        }
        return result;
    }

}
