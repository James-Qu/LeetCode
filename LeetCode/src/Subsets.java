import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test={1,2,3};
		System.out.println(subsets(test));
	}
	public static List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, 0);
	    return list;
	}

	private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
	    list.add(new ArrayList<>(tempList));
	    for(int i = start; i < nums.length; i++){
	        tempList.add(nums[i]);
	        for(int j=0;j<i;j++){
	        	System.out.print("-");
	        }
	        System.out.println("tempList+"+nums[i]);
	        backtrack(list, tempList, nums, i + 1);
	        tempList.remove(tempList.size() - 1);
	        for(int j=0;j<i;j++){
	        	System.out.print("-");
	        }
	        System.out.println("tempList-"+nums[i]);
	    }
	}
}
