/*213. House Robber II  QuestionEditorial Solution  My Submissions
Total Accepted: 33977
Total Submissions: 107116
Difficulty: Medium
Note: This is an extension of House Robber.

After robbing those houses on that street, the thief has found himself a 
new place for his thievery so that he will not get too much attention. 
This time, all houses at this place are arranged in a circle. 
That means the first house is the neighbor of the last one. 
Meanwhile, the security system for these houses remain the same as for those in the 
previous street.

Given a list of non-negative integers representing the amount of money of each house, 
determine the maximum amount of money you can rob tonight without alerting the police.*/
public class HouseRobber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int rob(int[] nums) {
        //corner case
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        
        //start with house 0
        int[] dp0=new int[nums.length-1];
        dp0[0]=nums[0];
        dp0[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length-1;i++){
            dp0[i]=Math.max(dp0[i-1],dp0[i-2]+nums[i]);
        }
        int result0=dp0[nums.length-2];
        //start with house 1
        dp0[0]=nums[1];
        dp0[1]=Math.max(nums[1],nums[2]);
        for(int i=2;i<nums.length-1;i++){
            dp0[i]=Math.max(dp0[i-1],dp0[i-2]+nums[i+1]);
        }
        int result1=dp0[nums.length-2];
        return result0>result1?result0:result1;
    }
}
