
public class AdditiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAdditiveNumber("198019823962"));
	}
    public static boolean isAdditiveNumber(String num) {
        int n=num.length();
        for(int i=1;i<=(n-1)/2;i++){
            if(num.charAt(0)=='0'&&i>1){
                return false;
            }
            
            for(int j=i+1; n-j>=j-i && n-j>=i;j++){
                if(num.charAt(i)=='0'&&j-i>1) return false;
                long first=Long.parseLong(num.substring(0,i));
                long second=Long.parseLong(num.substring(i,j));
                String ss=num.substring(j);
                if(isValid(first,second,ss)){
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean isValid(long first,long second,String str){
        if(str.equals("")){
            return true;
        }
        long sum=first+second;
        String s=((Long)sum).toString();
        if(!str.startsWith(s)){
            return false;
        }
        return isValid(second,sum,str.substring(s.length()));
    }
}
