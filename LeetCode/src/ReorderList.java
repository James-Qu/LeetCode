
public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(1);
		ListNode b=new ListNode(2);
		ListNode c=new ListNode(3);
		ListNode d=new ListNode(4);
		a.next=b;b.next=c;c.next=d;d.next=null;
		reorderList(a);
		/*System.out.println("a.next:"+a.next.val);
		System.out.println("b.next:"+b.next.val);
		System.out.println("c.next:"+c.next.val);
		System.out.println("d.next:"+d.next.val);*/
		System.out.println(a.next.val);
	}
    public static void reorderList(ListNode head) {
        //base case
        if(head==null||head.next==null||head.next.next==null){
            return;
        }
        //1.find middle point
        ListNode fast=head.next,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //2.reverse second half
        ListNode head2=slow.next;
        slow.next=null;
        ListNode head2Next=head2.next;
        head2.next=null;
        while(head2Next!=null){
            ListNode temp=head2Next.next;
            head2Next.next=head2;
            head2=head2Next;
            head2Next=temp;
        }
        //3.connect
        ListNode n1=head,n2=head2;
        while(n1!=null){
            ListNode temp=n1.next;
            n1.next=n2;
            n1=n1.next;
            n2=temp;
        }
    }
}
