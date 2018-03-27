/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, curr = head;
        int carry = 0; //进位
        
        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            curr.val = (carry + x + y) % 10;
            if(carry + x + y >= 10){
                carry = 1;
            }else{
                carry = 0;
            }
            if(p != null) p = p.next;
            if(q != null) q = q.next;
            if(p != null || q != null){
                curr.next = new ListNode(0);
                curr = curr.next;
            }
        }
        if(carry == 1){
            curr.next = new ListNode(1);
        }
        
        return head;
    }
}