/*69. Sqrt(x)  QuestionEditorial Solution  My Submissions
Total Accepted: 105182
Total Submissions: 404835
Difficulty: Medium
Implement int sqrt(int x).

Compute and return the square root of x.*/
public class SqrtX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(2147395599));
	}
    public static int mySqrt(int x) {
        if(x<0){
            return -1;
        }
        if(x==0){
            return 0;
        }
        
        int n=1,up=x;
        while(n<=up){
            int mid=n+(up-n)/2;
            if(mid<x/mid&&(mid+1)>x/(mid+1)||mid==x/mid){
                return mid;
            }
            if((mid+1)==x/(mid+1)){
            	return mid+1;
            }
            if(mid<x/mid&&(mid+1)<x/(mid+1)){
                n=mid+1;
            }
            if(mid>x/mid){
                up=mid-1;
            }
        }
        return n;
    }
}
