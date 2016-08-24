import java.util.Stack;

/*173. Binary Search Tree Iterator  QuestionEditorial Solution  My Submissions
Total Accepted: 57028
Total Submissions: 156735
Difficulty: Medium
Implement an iterator over a binary search tree (BST). 
Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and 
uses O(h) memory, where h is the height of the tree.*/
public class BinarySearchTreeIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class BSTIterator {
    //PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
    Stack<TreeNode> stack=new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(!stack.isEmpty()){
            return true;
        }
        return false;
    }

    /** @return the next smallest number */
    public int next() {
        
        TreeNode node=stack.pop();
        pushAll(node.right);
        return node.val;
    }
    
    //push all root plus all left child on stack
    public void pushAll(TreeNode node){
        while(node!=null){
            stack.push(node);
            node=node.left;
        }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */