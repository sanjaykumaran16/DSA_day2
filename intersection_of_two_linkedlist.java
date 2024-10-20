public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode d1=new ListNode();
        ListNode d2=new ListNode();
        d1=headA;
        d2=headB;
        while(d1!=d2){
            if(d1!=null) d1=d1.next;
            else d1=headB;
            if(d2!=null) d2=d2.next;
            else d2=headA;
        }
        return d2;
        
    }
}
