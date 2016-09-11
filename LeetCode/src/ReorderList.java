
public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(1);
		ListNode b=new ListNode(2);
		ListNode c=new ListNode(3);
		ListNode d=new ListNode(4);
		a.next=b;b.next=c;c.next=d;d.next=null;
		reorderList(a);
		System.out.println("a.next:"+a.next.val);
		System.out.println("b.next:"+b.next.val);
		System.out.println("c.next:"+c.next.val);
		System.out.println("d.next:"+d.next.val);
	}
    public static void reorderList(ListNode head) {
        //get length
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len<=2){
            return;
        }
        //reverse second half
        int count=0;
        ListNode dummy=head;
        for(int i=1;i<=len/2;i++){
            dummy=dummy.next;
        }
        ListNode dummyNext=dummy.next;
        while(dummyNext!=null){
            ListNode temp1=dummyNext.next;
            dummyNext.next=dummy;
            dummy=dummy.next;
            dummyNext=temp1;
        }
        
        //relink
        ListNode dummy1=head;
        for(int i=1;i<=len/2;i++){
            ListNode temp2=head.next;
            head.next=dummy;
            dummy.next=temp2;
            head=temp2;
            dummy=dummy.next;
        }
    }
}
