package leetcode;

/**
 * Created by zhangdong on 7/24/17.
 */
public class Leet002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        ListNode result = new ListNode(0);
        int carry=0;
        while (l1.next!=null && l2.next!=null){
            carry=(l1.val+l2.val)/10;
            result.val=(l1.val+l2.val)%10+carry;
            result=result.next;
            l1=l1.next;
            l2=l2.next;
        }
        if (l1.next==null) result.next=l2.next;
        if (l2.next==null) result.next=l1.next;
        return result;
    }

    public static void main(String[] args) {
        Leet002 leet = new Leet002();
        ListNode l1= new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        ListNode result = leet.addTwoNumbers(l1, l2);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
