import java.util.Arrays;

/*14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.*/
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();
        char[] start=strs[0].toCharArray();
        char[] end=strs[strs.length-1].toCharArray();
        int startLen=start.length;
        int endLen=end.length;
        for(int i=0,j=0;i<startLen&&j<endLen;i++,j++){
            if(start[i]==end[j]){
                sb.append(start[i]);
                continue;
            }
            break;
        }
        return sb.toString();
    }
}
