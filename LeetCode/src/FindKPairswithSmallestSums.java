import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairswithSmallestSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={1,1,2};
		int[] nums2={1,2,3};
		FindKPairswithSmallestSums ks=new FindKPairswithSmallestSums();
		System.out.println(ks.kSmallestPairs(nums1, nums2, 10));
	}
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        //put combinations in priorityqueue.
        List<int[]> res=new ArrayList<>();
        if(k<=0||nums1==null||nums2==null||nums1.length==0||nums2.length==0){
            return res;
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>(new MyComparator());
        for(int i=0;i<Math.min(nums1.length,k);i++){
            for(int j=0;j<Math.min(nums2.length,k);j++){
                int[] pair={nums1[i],nums2[j]};
                pq.add(pair);
            }
        }
        for(int i=0;i<Math.min(k,pq.size());i++){
            res.add(pq.poll());
        }
        return res;
    }
    
    class MyComparator implements Comparator<int[]>{
        public int compare(int[] a1,int[] a2){
            return a1[0]+a1[1]-(a2[0]+a2[1]);
        }
    }
}
