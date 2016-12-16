import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decodeString("10[lc]"));
	}
    public static String decodeString(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        Stack<String> res=new Stack<>();
        Stack<Integer> cnt=new Stack<>();
        res.push("");
        int i=0,len=s.length();
        while(i<len){
            char c=s.charAt(i);
            int start=i;
            if(c>='0'&&c<='9'){
                while(start<len){
                    if(s.charAt(start)>='0'&&s.charAt(start)<='9'){
                        start++;
                        continue;
                    }else{
                        break;
                    }
                }
                cnt.push(Integer.parseInt(s.substring(i,start)));
            }else if(c=='['){
                res.push("");
            }else if(c==']'){
                int times=cnt.pop();
                String str=res.pop();
                StringBuilder sb=new StringBuilder();
                for(int n=0;n<times;n++){
                    sb.append(str);
                }
                res.push(res.pop()+sb.toString());
            }else{
                res.push(res.pop()+Character.toString(c));
            }
            i++;
        }
        return res.pop();
    }
}
