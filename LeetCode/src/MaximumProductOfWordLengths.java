/*318. Maximum Product of Word Lengths  QuestionEditorial Solution  My Submissions
Total Accepted: 32070
Total Submissions: 78119
Difficulty: Medium
Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

Example 1:
Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
Return 16
The two words can be "abcw", "xtfn".

Example 2:
Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
Return 4
The two words can be "ab", "cd".

Example 3:
Given ["a", "aa", "aaa", "aaaa"]
Return 0
No such pair of words.*/
public class MaximumProductOfWordLengths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1<<0);
	}
    public int maxProduct(String[] words) {
        if(words==null||words.length==0){
            return 0;
        }
        //mark bit of each word
        int[] wordValue=new int[words.length];
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                wordValue[i]|=1<<(words[i].charAt(j)-'a');
            }
        }
        
        //calculate product
        int product=0;
        for(int i=0;i<wordValue.length;i++){
            for(int j=i+1;j<wordValue.length;j++){
                if((wordValue[i]&wordValue[j])==0&&words[i].length()*words[j].length()>product){
                    product=words[i].length()*words[j].length();
                }
            }
        }
        return product;
    }
}
