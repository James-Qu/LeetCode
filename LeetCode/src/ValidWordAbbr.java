import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidWordAbbr {
    private Map<String,HashSet<String>> map=new HashMap<>();
    public ValidWordAbbr(String[] dictionary) {
        for(String s:dictionary){
        	String st=transform(s);
        	if(!map.containsKey(st)){
        		HashSet<String> list=new HashSet<>();
        		list.add(s);
        		map.put(st, list);
        	}else{
        		map.get(st).add(s);
        	}
        }
    }
    
    public static void main(String[] args) {
    	String[] dic={"dear", "door", "cart", "cake"};
    	ValidWordAbbr v1=new ValidWordAbbr(dic);
    	System.out.println(v1.isUnique("deer"));
    	System.out.println(v1.isUnique("door"));;
    	System.out.println(v1.isUnique("cake"));;
    	System.out.println(v1.isUnique("card"));;
	}
    
    private String transform(String s){
        if(s.length()<=2){
            return s;
        }
        String digit=Integer.toString(s.length()-2);
        return s.charAt(0)+digit+s.charAt(s.length()-1);
    }

    public boolean isUnique(String word) {
        String tr=transform(word);
        if(tr==null||tr.trim().length()==0){
        	return true;
        }
        if(!map.containsKey(tr)||(map.containsKey(tr)&&map.get(tr).size()==1&&map.get(tr).contains(word))){
        	return true;
        }
        return false;
    }
}
