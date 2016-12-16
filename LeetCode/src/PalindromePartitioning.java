import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(partition("aab"));
	}
    public static List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        if(s==null||s.length()==0){
            return result;
        }
        backtrack(result,new ArrayList<>(),s,0);
        return result;
    }
    /*private boolean check(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }*/
     private static boolean check(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    
    private static void backtrack(List<List<String>> result,List<String> branch,String s,int start){
        int sum=0;
        for(String s1:branch){
            sum+=s1.length();
        }
       // if(sum==s.length()){
       //     result.add(new ArrayList<>(branch));
       //     return;
       // }
        if(branch.size()>0&&start>=s.length()&&sum>=s.length()){
            result.add(new ArrayList<>(branch));
            return;
        }
        for(int i=start;i<s.length();i++){
            if(check(s,start,i)){
                if(start==i){
                    branch.add(String.valueOf(s.charAt(i)));
                }else{
                    branch.add(s.substring(start,i+1));
                }
                backtrack(result,branch,s,i+1);
                branch.remove(branch.size()-1);
            }

        }
    }
}
