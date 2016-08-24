/*151. Reverse Words in a String  QuestionEditorial Solution  My Submissions
Total Accepted: 111588
Total Submissions: 707984
Difficulty: Medium
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".*/
public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="   a   b ";
		System.out.println(reverseWords(s));
	}
    public static String reverseWords(String s) {
        
        String[] split=s.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=split.length-1;i>0;i--){
            if(!split[i].isEmpty()){
                sb.append(split[i]+" ");
            }
        }
        if(!split[0].equals(" ")){
            sb.append(split[0]);
        }
        return sb.toString();
    }
}
