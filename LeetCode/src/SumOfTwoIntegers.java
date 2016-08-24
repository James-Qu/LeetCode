/*371. Sum of Two Integers  QuestionEditorial Solution  My Submissions
Total Accepted: 20524
Total Submissions: 39529
Difficulty: Easy
Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.*/
public class SumOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(2, 3));
	}
    public static int getSum(int a, int b) {
        //Use & to find the digit need to carry
        //use ^ to carry
        if(b==0){
            return a;
        }
        int carry=(a&b)<<1;
        int sum=a^b;
        //返回的是最下面一层的getSum return值，也就是b==0的时候a的值
        return getSum(sum,carry);
    }
}
