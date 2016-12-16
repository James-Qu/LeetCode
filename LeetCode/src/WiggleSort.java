import java.util.Arrays;

public class WiggleSort {
	public static void main(String[] args) {
		int[] test={3,5,2,1,6,4};
		wiggleSort(test);
		for(int a:test){
			System.out.println(a);
		}
	}
    public static void wiggleSort(int[] nums) {
        if(nums==null||nums.length<2) return;
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        int[] temp=new int[nums.length];
        int i=0;
        while(l<=r){
            temp[i]=nums[l];
            temp[i+1]=nums[r];
            i+=2;
            l++;r--;
        }
        nums=Arrays.copyOf(temp,nums.length);
    }
}
