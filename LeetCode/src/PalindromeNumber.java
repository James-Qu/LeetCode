/*9. Palindrome Number  QuestionEditorial Solution  My Submissions
Total Accepted: 138343
Total Submissions: 423884
Difficulty: Easy
Determine whether an integer is a palindrome. Do this without extra space.*/
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1000));
	}
    public static boolean isPalindrome(int x) {
        if(x<0||(x!=0&&x%10==0)){
            return false;
        }
        int rev=0;
        while(x>rev){
            rev=rev*10+x%10;
            x/=10;
        }
        if(rev==x||rev/10==x){
            return true;
        }
        return false;
    }
}
