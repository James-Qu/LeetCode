/*234. Palindrome Linked List  QuestionEditorial Solution  My Submissions
Total Accepted: 58509
Total Submissions: 197403
Difficulty: Easy
Given a singly linked list, determine if it is a palindrome.*/
public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		System.out.println(isPalindrome(n1));
	}
	public static boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        //count
        int i=1;
        ListNode temp=head;
        while(temp.next!=null){
            i++;
            temp=temp.next;
        }
        //move pointer
        ListNode second=head;
        for(int n=1;n<=i/2;n++){
            second=second.next;
        }
        //reverse
        ListNode fast=second.next;
        while(fast!=null){
            ListNode temp1=fast.next;
            fast.next=second;
            second=fast;
            fast=temp1;
        }
        //second is the new head of second half, compare node with first half
        for(int m=1;m<=i/2;m++){
            if(head.val!=second.val){
                return false;
            }else{
                head=head.next;
                second=second.next;
            }
        }
        return true;
	}
}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}