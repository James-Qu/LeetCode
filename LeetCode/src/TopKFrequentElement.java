import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/*347. Top K Frequent Elements  QuestionEditorial Solution  My Submissions
Total Accepted: 23364
Total Submissions: 53624
Difficulty: Medium
Given a non-empty array of integers, return the k most frequent elements.

For example,
Given [1,1,1,2,2,3] and k = 2, return [1,2].

Note: 
You may assume k is always valid, 1 ¡Ü k ¡Ü number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.*/
public class TopKFrequentElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,1,3,3,2,2,44,44,4,5,6,7,8,9};
		System.out.println(topKFrequent(num, 2));
	}
    public static List<Integer> topKFrequent(int[] nums, int k) {
        //TreeMap
        if(nums==null||nums.length==0){
            return new ArrayList<Integer>();
        }
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        TreeMap<Integer,List<Integer>> result=new TreeMap<Integer,List<Integer>>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            
            if(!result.containsKey(entry.getValue())){
                //List<Integer> record=new ArrayList<Integer>();
                //record.add(entry.getKey());
                result.put(entry.getValue(),new ArrayList<Integer>());
            }
            //List<Integer> record=result.get(entry.getValue());
            //record.add(entry.getKey());
            //result.put(entry.getValue(),record);
            result.get(entry.getValue()).add(entry.getKey());
            
        }
        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            Map.Entry<Integer, List<Integer>> entry = result.pollLastEntry();
            res.addAll(entry.getValue());
        }
        return res;
        
    }
}
