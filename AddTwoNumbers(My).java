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
        int temp = 0;
        int tempS = 0;
        int tempG = 0;
        ListNode L1 = l1;
        ListNode L2 = l2;
        /*
        * 对于链表的操作来说，一般的情况下，对第一个结点的操作单独列出，后面的操作可通过循环。
        */
        temp = L1.val + L2.val;
        tempS = temp/10;
        tempG = temp%10;
        L1 = L1.next;
        L2 = L2.next;
        // 善于利用题目给出的条件。
        ListNode result = new ListNode(tempG);
        // 永远不能直接操作链表的头结点，需要设置一个引用。
        ListNode resultT = result;    
        while(L1 != null && L2 != null) {
            temp = L1.val + L2.val + tempS;
            tempS = temp/10;
            tempG = temp%10;
            resultT.next = new ListNode(tempG);
            resultT = resultT.next;
            L1 = L1.next;
            L2 = L2.next;
        }
        /*
        * 找到较长的那个链表（也就是较大的那个数字），继续操作
        */
        if(L1 == null)
            L1 = L2;
        while(L1 != null) {
            temp = L1.val + tempS;
            tempS = temp/10;
            tempG = temp%10;
            resultT.next = new ListNode(tempG);
            resultT = resultT.next;
            L1 = L1.next;
        }
        //如果操作完后还有进位
        if (tempS != 0)
            resultT.next = new ListNode(tempS);
        return result;
    }
}