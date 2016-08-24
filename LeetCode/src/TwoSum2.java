/*167. Two Sum II - Input array is sorted  QuestionEditorial Solution  My Submissions
Total Accepted: 16774
Total Submissions: 33926
Difficulty: Medium
Given an array of integers that is already sorted in ascending order, 
find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they 
add up to the target, where index1 must be less than index2. Please note that your 
returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2*/
public class TwoSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test={3,24,50,79,88,150,345};
		int target=200;
		for(int num:twoSum(test, target)){
			System.out.println(num);
		}
	}
    public static int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int slow=0,fast=1;
        boolean fastFlag=true;
        while(slow<numbers.length-1&&fast<numbers.length){
            if(numbers[slow]+numbers[fast]<target&&fast!=numbers.length-1&&fastFlag){
                fast++;
                if(numbers[fast]+numbers[slow]>target){
                    fast--;
                    fastFlag=false;
                }
            }
            if(numbers[slow]+numbers[fast]==target){
                result[0]=slow+1;
                result[1]=fast+1;
                break;
            }else{
                slow++;
            }
        }
        return result;
    }
}
