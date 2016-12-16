
public class test {

	public static void main(String[] args) {
		TreeNode r1=new TreeNode(3);
		TreeNode r2=new TreeNode(9);
		TreeNode r3=new TreeNode(20);
		TreeNode r4=new TreeNode(15);
		TreeNode r5=new TreeNode(7);
		r1.left=r2;r1.right=r3;r2.left=r4;r2.right=r5;
		sumOfLeftLeaves(r1);
		System.out.println(result);
	}
	
    static int result=0;
    public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        helper(root.right,result,false);
        helper(root.left,result,true);
        return result;
    }
    
    private static void helper(TreeNode root,int result,boolean isLeftLeaf){
        if(root==null){
            return;
        }
        if(isLeftLeaf==true&&root.left==null&&root.right==null){
            result+=root.val;
        }
        //if(root.left!=null){
            helper(root.left,result,true);
        //}
        //if(root.right!=null){
            helper(root.right,result,false);
        //}
    }
}
