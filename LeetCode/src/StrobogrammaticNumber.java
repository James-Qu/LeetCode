import java.util.HashSet;
import java.util.Set;

public class StrobogrammaticNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isStrobogrammatic("121"));
	}
    public static boolean isStrobogrammatic(String num) {
        if(num==null||num.length()==0){
            return true;
        }
        Set<Character> set=new HashSet<>();
        set.add('0');
        set.add('1');
        set.add('6');
        set.add('8');
        set.add('9');
        int l=0,r=num.length()-1;
        while(l<=r){
            char ll=num.charAt(l);
            char rr=num.charAt(r);
            if(set.contains(ll)&&set.contains(rr)){
                if(ll==rr) return true;
                if((ll=='6'&&rr=='9')||(ll=='9'&&rr=='6')) return true;
            }
            l++;r--;
        }
        return false;
    }
}
