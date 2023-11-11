/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //  ListNode start = new ListNode(0);
        // ListNode ptr = start;
        // while(l1!=null&&l2!=null)
        // {
        //     if(l1.val>l2.val)
        //     {
        //         ptr.next = new ListNode(l2.val);
        //         ptr = ptr.next;
        //         l2 = l2.next;
        //     }
        //     else
        //     {
        //         ptr.next = new ListNode(l1.val);
        //         ptr = ptr.next;
        //         l1 = l1.next;                
        //     }
        // }
        // if(l2==null)
        //     ptr.next = l1;
        // else
        //     ptr.next = l2;
        // return start.next;

        // ListNode result = new ListNode();
        // ListNode head = result;
        // while(list1!= null && list2 != null){
        //     if(list1.val <list2.val){
        //         result.next = list1;
        //         result = result.next;
        //         list1 = list1.next;
        //     }
        //     else{
        //         result.next = list2;
        //         result = result.next;
        //         list2 = list2.next;
        //     }
        // }
        // if(list1!= null){
        //     result.next = list1;
        // }
        // if(list2 != null){
        //     result.next = list2;

        // }
        // return head.next;

        ListNode start = new ListNode(0);
        ListNode ptr = start;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                ptr.next = new ListNode(l1.val);
                ptr = ptr.next;
                l1 = l1.next;

            }
            else{
                ptr.next = new ListNode(l2.val);
                ptr = ptr.next;
                l2 = l2.next;
            }
        }
        if(l2 == null){
            ptr.next= l1;
        }
        if(l1 == null){
            ptr.next = l2;
        }
    

    return start.next;



    }

}
