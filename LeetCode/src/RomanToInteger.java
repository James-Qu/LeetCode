import java.util.HashMap;
import java.util.Map;

/*13. Roman to Integer  QuestionEditorial Solution  My Submissions
Total Accepted: 96478
Total Submissions: 234939
Difficulty: Easy
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.*/
public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int romanToInt(String s) {
        if(s==null||s.isEmpty()){
            return 0;
        }
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);
        int result=0;
        StringBuilder sb=new StringBuilder(s);
        //char[] c=s.toCharArray();
        int i=0;
        while(i<sb.length()){
            int max1=0,max2=0;
            //get one letter value
            if(map.containsKey(sb.substring(i,i+1))){
                 max1=map.get(sb.substring(i,i+1)); 
            }
            if((i+1)<sb.length()&&map.containsKey(sb.substring(i,i+2))){
                max2=map.get(sb.substring(i,i+2));
            }
            if(max1>max2){
                result+=max1;
                i++;
            }else{
                result+=max2;
                i+=2;
            }
        }
        return result;
    }
}
