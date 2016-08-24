/*190. Reverse Bits  QuestionEditorial Solution  My Submissions
Total Accepted: 72189
Total Submissions: 245060
Difficulty: Easy
Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?*/
public class ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            result+=n&1;
            n=n>>1;
            if(i<31){
                result=result<<1;
            }
        }
        return result;
    }
}
