 public class Solution {
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if(headA == null || headB == null) return null;
         ListNode cur1 = headA, cur2 = headB;
         int reach = 0;
         while(cur1 != cur2){
             cur1 = cur1.next;
             if(cur1 == null){
                 cur1 = headB;
                 if(++reach == 2) return null;
             }
             cur2 = cur2.next;
             if(cur2 == null) cur2 = headA;
         }
         return cur1;
     }
 }
