import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,1,2};
		System.out.println(permuteUnique(nums));
	}
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums==null||nums.length==0){
            return result;
        }
        boolean[] used=new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums,used,new ArrayList<>(),result);
        return result;
    }
    
    public static void backtrack(int[] nums,boolean[] used,List<Integer> branch,List<List<Integer>> result){
        if(branch.size()==nums.length){
            result.add(new ArrayList<>(branch));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]||i>0&&nums[i]==nums[i-1]&&!used[i-1]){
                continue;
            }
            branch.add(nums[i]);
            used[i]=true;
            backtrack(nums,used,branch,result);
            used[i]=false;
            branch.remove(branch.size()-1);
        }
    }
}
