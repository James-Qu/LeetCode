
public class MaximumProductSubarray {

	public static void main(String[] args) {
		int[] nums={2,-1,1,1};
		// TODO Auto-generated method stub
		System.out.println(maxProduct(nums));
	}
    public static int maxProduct(int[] nums) {
    	if(nums.length==1){
            return nums[0];
        }
        int[] dpMax=new int[nums.length];
        int[] dpMin=new int[nums.length];
        int product=nums[0];
        dpMax[0]=dpMin[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dpMax[i]=Math.max(dpMax[i-1]*nums[i],dpMin[i-1]*nums[i]);
            dpMax[i]=Math.max(dpMax[i],nums[i]);
            dpMin[i]=Math.min(dpMax[i-1]*nums[i],dpMin[i-1]*nums[i]);
            dpMin[i]=Math.min(dpMax[i],nums[i]);
            product=Math.max(product,dpMax[i]);
        }
        return product;
    }
}
