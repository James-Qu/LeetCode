import java.util.ArrayList;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a=new ListNode(5);
		ListNode b=new ListNode(3);
		ListNode c=new ListNode(1);
		a.next=b;b.next=c;c.next=null;
		System.out.println(sortList(a).val);
	}
    public static ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        List<ListNode> list=new ArrayList<>();
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            list.add(temp);
            temp=temp.next;
        }
        mergeSort(list,0,len-1);
        for(int i=0;i<list.size()-1;i++){
            list.get(i).next=list.get(i+1);
        }
        list.get(list.size()-1).next=null;
        return list.get(0);
    }
    public static void mergeSort(List<ListNode> list,int p,int r){
        if(p<r){
            int q=(p+r)/2;
            mergeSort(list,p,q);
            mergeSort(list,q+1,r);
            merge(list,p,q,r);
        }
    }
    
    public static void merge(List<ListNode> list,int p, int q, int r){
        int n1=q-p+1;
        int n2=r-q;
        List<ListNode> llist=new ArrayList<>();
        List<ListNode> rlist=new ArrayList<>();
        for(int i=0;i<n1;i++){
            llist.add(list.get(i));
        }
        for(int j=0;j<n2;j++){
            rlist.add(list.get(q+j));
        }
        int m=0,n=0;
        for(int x=0;x<list.size();x++){
            if(llist.get(m).val<rlist.get(n).val){
                list.add(x,llist.get(m));
                m++;
            }else{
                list.add(x,rlist.get(n));
                n++;
            }
        }
    }
}
