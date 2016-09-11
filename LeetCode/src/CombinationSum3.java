import java.util.ArrayList;
import java.util.List;
/*216. Combination Sum III  QuestionEditorial Solution  My Submissions
Total Accepted: 43693
Total Submissions: 110923
Difficulty: Medium
Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.


Example 1:

Input: k = 3, n = 7

Output:

[[1,2,4]]

Example 2:

Input: k = 3, n = 9

Output:

[[1,2,6], [1,3,5], [2,3,4]]*/
public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int target=n;
        int[] nums=new int[9];
        for(int i=1;i<9;i++){
            nums[i]=i+1;
        }
        nums[0]=1;
        List<List<Integer>> result=new ArrayList<>();
        backtrack(target,k,0,nums,result,new ArrayList<Integer>());
        return result;
    }
    
    public void backtrack(int target,int k,int start,int[] nums,List<List<Integer>> result,List<Integer> branch){
        if(branch.size()>k||target<0){
            return;
        }
        if(branch.size()==k&&target==0){
            result.add(new ArrayList(branch));
        }
        for(int i=start;i<nums.length;i++){
            branch.add(nums[i]);
            backtrack(target-nums[i],k,i+1,nums,result,branch);
            branch.remove(branch.size()-1);
        }
    }
}
