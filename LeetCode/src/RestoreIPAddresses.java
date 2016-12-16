import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(restoreIpAddresses("0000"));
	}
    public static List<String> restoreIpAddresses(String s) {
        List<String> result=new ArrayList<>();
        if(s==null||s.length()<4){
            return result;
        }
        for(int i=1;i<4&&i<s.length()-2;i++){
            String s1=s.substring(0,i);
            if(isValid(s1)){
                for(int j=i+1;j<i+4&&j<s.length()-1;j++){
                    String s2=s.substring(i,j);
                    if(isValid(s2)){
                        for(int k=j+1;k<j+4&&k<s.length();k++){
                            String s3=s.substring(j,k);
                            if(isValid(s3)){
                                String s4=s.substring(k,s.length());
                                if(isValid(s4)){
                                    result.add(s1+"."+s2+"."+s3+"."+s4);
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
    private static boolean isValid(String str){
        if(str==null||str.length()==0){
            return false;
        }
        if(str.length()>1&&str.startsWith("0")){
            return false;
        }
        int n=Integer.parseInt(str);
        if(n>255){
            return false;
        }
        return true;
    }
}
