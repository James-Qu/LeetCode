
public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canPermutePalindrome("abcc"));
	}

	
    public static boolean canPermutePalindrome(String s) {
        if(s==null||s.length()==0) return true;
        int[] dic=new int[26];
        for(char c:s.toCharArray()){
            dic[c-'a']++;
        }
        int oddCount=0;
        for(int i:dic){
            if(i%2!=0){
                oddCount++;
            }
        }
        if(oddCount>=1){
            return false;
        }
        return true;
    }
}
