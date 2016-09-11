import java.util.ArrayList;
import java.util.List;
/*77. Combinations  QuestionEditorial Solution  My Submissions
Total Accepted: 89208
Total Submissions: 244321
Difficulty: Medium
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:

[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]*/
public class Combination {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        if(n<1||k<1){
            return result;
        }
        int[] nums=new int[n];
        for(int i=1;i<n;i++){
            nums[i]=i+1;
        }
        nums[0]=1;
        backtrack(nums,k,0,result,new ArrayList<Integer>());
        return result;
    }
    public void backtrack(int[] nums, int k, int start, List<List<Integer>> result,List<Integer> branch){
        if(branch.size()==k){
            result.add(new ArrayList<>(branch));
            return;
        }
        for(int i=start;i<nums.length;i++){
            branch.add(nums[i]);
            backtrack(nums,k,i+1,result,branch);
            branch.remove(branch.size()-1);
        }
    }
}
