import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*18. 4Sum  QuestionEditorial Solution  My Submissions
Total Accepted: 84495
Total Submissions: 341233
Difficulty: Medium
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note: The solution set must not contain duplicate quadruplets.

For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]*/
public class FourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> finalResult=new ArrayList<List<Integer>>();
        if(nums==null||nums.length<4){
            return finalResult;
        }
        int base=0,len=nums.length;
        Arrays.sort(nums);
        for(;base<len-3;base++){
            //int second=base+1;
            if(base>0&&nums[base]==nums[base-1]){
                continue;
            }
            for(int second=base+1;second<len-2;second++){
                if(second>base+1&&nums[second]==nums[second-1]){
                    continue;
                }
                int newTarget=target-nums[base]-nums[second],i=second+1,j=len-1;
                while(i<j){
                    if(nums[i]+nums[j]==newTarget){
                        finalResult.add(Arrays.asList(nums[base],nums[second],nums[i],nums[j]));
                        while(i<j&&nums[i]==nums[i+1]){
                            i++;
                        }
                        while(i<j&&nums[j]==nums[j-1]){
                            j--;
                        }
                        i++;
                        j--;
                    }else{
                        if(nums[i]+nums[j]<newTarget){
                            i++;
                        }else{
                            j--;
                        }
                    }
                }
            }
        }
        return finalResult;
    }
}
