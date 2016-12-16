
public class ConstructBinaryTreeFromInorderPostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in={1,8,6,10,9};
		int[] post={1,6,8,9,10};
		ConstructBinaryTreeFromInorderPostorderTraversal c=new ConstructBinaryTreeFromInorderPostorderTraversal();
		System.out.println(c.buildTree(in, post));
	}
	
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,postorder,0,postorder.length-1,0,inorder.length-1);
    }
    
    private TreeNode build(int[] inorder,int[] postorder,int postStart,int postEnd,int inStart,int inEnd){
        if(inStart>inEnd) return null;
        TreeNode root=new TreeNode(postorder[postEnd]);
        int index=0;
        for(int i=inStart;i<inEnd;i++){
            if(inorder[i]==root.val) index=i;
        }
        //                                            postEnd
        root.left=build(inorder,postorder,postStart,postStart+index-inStart-1,inStart,index-1);
        root.right=build(inorder,postorder,postStart+index-inStart,postEnd-1,index+1,inEnd);
        return root;
    }

}
