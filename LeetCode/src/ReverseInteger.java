/*7. Reverse Integer  QuestionEditorial Solution  My Submissions
Total Accepted: 155884
Total Submissions: 654993
Difficulty: Easy
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321*/
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int reverse(int x) {
        int result=0;
        while(x!=0){
            int tail=x%10;
            int newResult=result*10+tail;
            if((newResult-tail)/10!=result){
                return 0;
            }
            result=newResult;
            x/=10;
        }
        return result;
    }
}
