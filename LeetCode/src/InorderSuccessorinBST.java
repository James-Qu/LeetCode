import java.util.LinkedList;
import java.util.Stack;

public class InorderSuccessorinBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(2);
		TreeNode p=new TreeNode(1);
		root.left=p;
		System.out.println(inorderSuccessor(root, p));
	}
    
	
	public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        //create inorder traversal list, then find p's successor
        if(root==null||(root.left==null&&root.right==null)) return null;
        LinkedList<TreeNode> inorder=new LinkedList<>();
        Stack<TreeNode> stack=new Stack<>();
        while(root!=null){
            root=root.left;
        }
        stack.push(root);
        boolean visited=false;
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(node==p&&visited==false){
                visited=true;
            }
            
            TreeNode right=node.right;
            while(right!=null){
                stack.push(right);
                right=right.left;
            }
            if(node==p&&visited==true){
                if(!stack.isEmpty()){
                    return stack.pop();
                }
            }
        }
        return null;
    }
}
