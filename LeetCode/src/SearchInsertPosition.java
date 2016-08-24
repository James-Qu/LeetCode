/*35. Search Insert Position  QuestionEditorial Solution  My Submissions
Total Accepted: 116311
Total Submissions: 306056
Difficulty: Medium
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 ¡ú 2
[1,3,5,6], 2 ¡ú 1
[1,3,5,6], 7 ¡ú 4
[1,3,5,6], 0 ¡ú 0*/
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int searchInsert(int[] nums, int target) {
        //brutal force solution
        int len=nums.length;
        if(len==0){
            return 0;
        }
        if(len==1){
            if(target<=nums[0]){
                return 0;
            }else{
                return 1;
            }
        }
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[len-1]){
            return len;
        }
        //two pointers
        for(int i=0,j=1;j<len;i++,j++){
            if(target==nums[i]){
                return i;
            }
            if(target==nums[j]||(target>nums[i]&&target<nums[j])){
                return j;
            }
            if(target>nums[j]){
                continue;
            }
        }
        return -1;
        
      //Binary search
        /*if(nums.length==0){
            return 0;
        }
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;*/
    }
}
