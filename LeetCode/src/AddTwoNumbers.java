/*2. Add Two Numbers  QuestionEditorial Solution  My Submissions
Total Accepted: 173929
Total Submissions: 702711
Difficulty: Medium
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8*/
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(2);
		ListNode b=new ListNode(4);
		ListNode c=new ListNode(3);
		ListNode d=new ListNode(5);
		ListNode e=new ListNode(6);
		ListNode f=new ListNode(4);
		a.next=b;b.next=c;c.next=null;
		d.next=e;e.next=f;f.next=null;
		System.out.println(addTwoNumbers(a, d));
		
	}
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode newHead=new ListNode(0);
        ListNode result=newHead;
        int carry=0,sum=0;
        while(l1!=null||l2!=null||carry!=0){
            if(l1==null){
                l1=new ListNode(0);
                l1.next=null;
            }
            if(l2==null){
                l2=new ListNode(0);
                l2.next=null;
            }
            int res=l1.val+l2.val+carry;
            carry=res/10;
            ListNode curr=new ListNode(0);
            curr.val=res%10;
            newHead.next=curr;
            newHead=newHead.next;
            l1=l1.next;
            l2=l2.next;
        }
        return result.next;
    }
}
