/*165. Compare Version Numbers  QuestionEditorial Solution  My Submissions
Total Accepted: 60743
Total Submissions: 332456
Difficulty: Easy
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37*/
public class CompareVersionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareVersion("1","1.1"));
	}
	public static int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        int v1Len=v1.length;
        int v2Len=v2.length;
        int flag=v1Len>v2Len?v2Len:v1Len;
        boolean v1Longer=v1Len>v2Len?true:false;
        boolean v1EqualV2=v1Len==v2Len?true:false;
        /*if(v1Len<v2Len){
            flag=v1Len;
        }else{
            flag=v2Len;
        }*/
        for(int i=0;i<flag;i++){
            if(Integer.parseInt(v1[i])<Integer.parseInt(v2[i])){
                return -1;
            }else if(Integer.parseInt(v1[i])>Integer.parseInt(v2[i])){
                return 1;
            }else{
                //if both has version number left, continue compare for the next number
                if(i<v1Len-1&&i<v2Len-1){
                    continue;
                }
                //if both arrive last number
                if(v1EqualV2&&i==flag-1){
                    return 0;
                }
                if(v1Longer&&!v1EqualV2){
                    //check if v1 follow by all 0
                    for(int j=i+1;j<v1Len;j++){
                        if(Integer.parseInt(v1[j])==0){
                            continue;
                        }else{
                            return 1;
                        }
                    }
                    return 0;
                }
                if(!v1Longer&&!v1EqualV2){
                    for(int j=i+1;j<v2Len;j++){
                        if(Integer.parseInt(v2[j])==0){
                            continue;
                        }else{
                            return -1;
                        }
                    }
                    return 0;
                }
                
                
            }
        }
        return -2;
    }
}
