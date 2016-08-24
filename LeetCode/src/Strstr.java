/*28. Implement strStr().
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.*/
public class Strstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("ippi","pi"));

	}
	public static int strStr(String haystack, String needle) {
		if(haystack.isEmpty()&&needle.isEmpty()){
			return 0;
		}else if(haystack.isEmpty()&&!needle.isEmpty()){
			return -1;
		}else if(!haystack.isEmpty()&&needle.isEmpty()){
			return 0;
		}
		if(needle.length()>haystack.length()){
			return -1;
		}
		if(!haystack.contains(needle)){
			return -1;
		}
		for(int i=0,j=0;i<haystack.length();i++){
			if(haystack.charAt(i)!=needle.charAt(j)){
				continue;
			}else{
				//test
				for(int m=i;m<haystack.length();m++){
					if(haystack.charAt(m)==needle.charAt(j)){
						if(j==needle.length()-1){
							return i;
						}
						j++;
					}else{
						j=0;
						break;
					}

				}
			}
		}
		return -1;
	}
}
