
public class ClosestBinarySearchTreeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1=new TreeNode(1);
		double target=4.2;
		ClosestBinarySearchTreeValue c1=new ClosestBinarySearchTreeValue();
		System.out.println(c1.closestValue(t1, target));
	}
	double dif=Double.MAX_VALUE;
    public int closestValue(TreeNode root, double target) {
        helper(root,target);
        return (int)(target-dif);
    }
    
    private void helper(TreeNode root,double target){
        if(root==null) return;
        if(target==root.val){
        	dif=0;
            return;
        }
        if(target<root.val){
        	dif=Math.min(target-root.val,dif);
            helper(root.left,target);
        }
        if(target>root.val){
        	dif=Math.min(target-root.val,dif);
            helper(root.right,target);
        }
    }
}
