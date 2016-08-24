/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".*/
public class ZigzagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("PAYPALISHIRING",3));
	}
    public static String convert(String s, int numRows) {
        if(s==null||s.isEmpty()||numRows==0){
            return "";
        }
        if (numRows==1||s.length()<numRows){
            return s;
        }
        char[] c=s.toCharArray();
        int cLen=c.length;
        int i=0;
        StringBuilder[] sbArray=new StringBuilder[numRows];
        for(int ix=0;ix<numRows;ix++){
            sbArray[ix]=new StringBuilder();
        }
        while(i<cLen){
            //vertical line
            for(int j=0;j<numRows&&i<cLen;j++){
                sbArray[j].append(c[i++]);
            }
            //diagonal line
            for(int j=numRows-2;j>0&&i<cLen;j--){
                sbArray[j].append(c[i++]);
            }
        }
        //combine stringbuilder array
        for(int ix=1;ix<sbArray.length;ix++){
            sbArray[0].append(sbArray[ix]);
        }
        return sbArray[0].toString();
    }
}
