
public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas={1,2},cost={2,1};
		System.out.println(canCompleteCircuit(gas, cost));
	}
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0,totalCost=0;
        for(int g:gas){
            totalGas+=g;
        }
        for(int c:cost){
            totalCost+=c;
        }
        if(totalGas<totalCost){
            return -1;
        }
        int start=0;
        for(int i=0;i<gas.length;){
            int sum=0,j=i;
            while(sum>=0){
                sum+=gas[j]-cost[j];
                j++;
                if(j==gas.length){
                    j=0;
                }
                if(j==i){
                    return i;
                }
            }
            i=(j==0?gas.length-1:j-1);
        }
        return -1;
    }
}
