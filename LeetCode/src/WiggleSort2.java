import java.util.Arrays;

public class WiggleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,5,1,1,6,4};
		wiggleSort(nums);
		for(int i:nums){
			System.out.println(i);
		}
	}
    public static void wiggleSort(int[] nums) {
        //1st try: sort first from small to big. take one from left and then one from right
        if(nums==null||nums.length==0){
            return;
        }
        Arrays.sort(nums);
        int[] a=Arrays.copyOf(nums,nums.length);
        int i=0,j=nums.length-1;
        for(int m=0;m<nums.length;m++){
            if(m%2==0){
                nums[m]=a[i++];
            }else{
                nums[m]=a[j--];
            }
        }
    }
}
