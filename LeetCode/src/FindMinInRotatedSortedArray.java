
public class FindMinInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={4,5,6,7,1,2};
		System.out.println(findMin(a));
	}
    public static int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sortOrder=-1;
        if(nums[0]>nums[nums.length-1]){
            //desc order
            sortOrder=0;
        }else if(nums[0]<nums[nums.length-1]){
            //assending order
            sortOrder=1;
        }
        
        if(sortOrder==0){
            for(int i=0,j=1;j<nums.length;i++,j++){
                if(nums[i]>nums[j]){
                    continue;
                }else{
                    return nums[i];
                }
            }
        }else{
            for(int i=0,j=1;j<nums.length;i++,j++){
                if(nums[i]<nums[j]){
                    continue;
                }else{
                    return nums[j];
                }
            }
        }
        return -9999;
    }
}
