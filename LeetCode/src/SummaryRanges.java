import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,1};
		System.out.println(summaryRanges(nums));
	}
    public static List<String> summaryRanges(int[] nums) {
        List<String> res=new ArrayList<>();
        if(nums==null||nums.length==0){
            return res;
        }
        if(nums.length==1){
            res.add(nums[0]+"");
            return res;
        }
        int i=0,j=1,beforeJ=0;
        for(;i<nums.length&&j<nums.length;){
            if(nums[beforeJ]+1==nums[j]){
                //if sequential, move pointers.
                beforeJ=j;
                //all sequential case
                if(j==nums.length-1){
                    if(nums[j]==nums[beforeJ]+1){
                        //res.remove(res.size()-1);
                        res.add(nums[i]+"->"+nums[j]);
                    }else{
                        res.add(nums[j]+"");
                    }
                    break;
                }
                j++;
            }else{
                if(nums[i]==nums[beforeJ]){
                    res.add(nums[i]+"");
                    i++;j++;beforeJ=j-1;
                }else{
                    res.add(nums[i]+"->"+nums[beforeJ]);
                    //j already reaches end of array
                    if(j==nums.length-1){
                        if(nums[j]==nums[beforeJ]+1){
                            res.remove(res.size()-1);
                            res.add(nums[i]+"->"+nums[j]);
                        }else{
                            res.add(nums[j]+"");
                        }
                        break;
                    }
                    i=j;beforeJ=j;j++;
                }

            }
        }
        return res;
    }
}
