/*204. Count Primes  QuestionEditorial Solution  My Submissions
Total Accepted: 74323
Total Submissions: 293722
Difficulty: Easy
Description:

Count the number of prime numbers less than a non-negative number, n.*/
public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int countPrimes(int n) {
        boolean[] c=new boolean[n];
        for(int i=2;i<n;i++){
            c[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(!c[i]){
                continue;
            }
            for(int j=i*i;j<n;j+=i){
                c[j]=false;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(c[i]==true)
                count++;
        }
        return count;
    }
}
