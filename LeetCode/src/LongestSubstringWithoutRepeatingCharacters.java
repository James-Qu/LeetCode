import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
    /*public static int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        //n2 solution
        int counter=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            Set<Character> set=new HashSet<>();
            int j=i;
            while(j<s.length()){
                if(set.add(s.charAt(j))){
                    ++counter;
                }else{
                    break;
                }
                j++;
            }
            if(counter>max){
                max=counter;
            }
            counter=0;
        }
        return max;
    }*/
	public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
