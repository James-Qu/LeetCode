/*86. Partition List  QuestionEditorial Solution  My Submissions
Total Accepted: 75979
Total Submissions: 247962
Difficulty: Medium
Given a linked list and a value x, partition it such that all nodes less than x come 
before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.*/
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null){
            return head;
        }
        //find the first node larger than x. This is the point that smaller value should be put before
        ListNode dummy1=new ListNode(0), dummy2=new ListNode(0);
        ListNode curr1=dummy1,curr2=dummy2;
        while(head!=null){
            if(head.val>=x){
                curr2.next=head;
                curr2=head;
            }else{
                curr1.next=head;
                curr1=head;
            }
            head=head.next;
        }
        curr2.next=null;
        curr1.next=dummy2.next;
        return dummy1.next;
    }
}
