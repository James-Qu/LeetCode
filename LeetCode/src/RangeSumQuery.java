/*303. Range Sum Query - Immutable  QuestionEditorial Solution  My Submissions
Total Accepted: 38303
Total Submissions: 150303
Difficulty: Easy
Given an integer array nums, find the sum of the elements between indices i and j (i ¡Ü j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.*/
public class RangeSumQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    int[] nums;
    public RangeSumQuery(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        this.nums=nums;
    }

    public int sumRange(int i, int j) {
        if(i==0){
            return nums[j];
        }
        return nums[j]-nums[i-1];
    }
}
