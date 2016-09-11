import java.util.Arrays;

/*16. 3Sum Closest  QuestionEditorial Solution  My Submissions
Total Accepted: 90296
Total Submissions: 301346
Difficulty: Medium
Given an array S of n integers, find three integers in S such that the sum is closest 
to a given number, target. Return the sum of the three integers. You may assume that 
each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).*/


public class ThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={0,2,1,-3};
		System.out.println(threeSumClosest(num, 1));
	}
    public static int threeSumClosest(int[] nums, int target) {
        if(nums==null||nums.length<3){
            return Integer.MIN_VALUE;
        }
        int diff=Integer.MAX_VALUE,base=0,len=nums.length,result=Integer.MIN_VALUE;
        Arrays.sort(nums);
        if(nums[0]+nums[1]+nums[2]>target){
            return nums[0]+nums[1]+nums[2];
        }
        while(base<len-2){
            int left=base+1,right=len-1;
            while(left<right){
                int sum=nums[base]+nums[left]+nums[right];
                if(sum<target){
                    left++;
                }else{
                    right--;
                }

                if(Math.abs(sum-target)<diff){
                    diff=Math.abs(sum-target);
                    result=sum;
                }
            }
            base++;
        }
        return result;
    }
}
