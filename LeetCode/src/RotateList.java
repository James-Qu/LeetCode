
public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(1);
		ListNode b=new ListNode(2);
		a.next=b;
		b.next=null;
		rotateRight(a, 2);
	}
    public static ListNode rotateRight(ListNode head, int k) {
        //corner case
        if(head==null||k==0||head.next==null){
            return head;
        }
        //count list length
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        //get actual move distance
        int actual=k%length;
        
        //relink
        ListNode newHead=head;
        ListNode newTail=head;
        for(int i=1;i<=length-actual-1;i++){
            newTail=newTail.next;
        }
        newHead=newTail.next;
        newTail.next=null;
        ListNode btemp=newHead;
        for(int i=1;i<=actual-1;i++){
            btemp=btemp.next;
        }
        btemp.next=head;
        return newHead;
    }
}
