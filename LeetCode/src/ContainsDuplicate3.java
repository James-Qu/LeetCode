import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={-1,-1};
		
		System.out.println(containsNearbyAlmostDuplicate(nums, 1, 0));
	}

	
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums==null||nums.length<=1||k==0){
            return false;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j<=i+k&&j<nums.length){
                if(Math.abs(map.get(i)-map.get(j))<=t){
                    return true;
                }
                j++;
            }
        }
        return false;   
    }
}
