/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        if(head.next==null){
            return false;
        }
        ListNode fast =head.next.next;
        if(fast==null){
            return false;
        }
        ListNode slow = head;
        while(slow!=fast){
            slow = slow.next;
            if(fast==null){
                break;
            }
            if(fast.next==null){
                break;
            }
            fast = fast.next.next;
        }
        if(fast==slow&&fast!=null){
            return true;
        }else{
            return false;
        }
        
    }
}
// @lc code=end

