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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        
        ListNode result = new ListNode();
            ListNode temp = result;
            
            while(list1 != null && list2 != null) { // 계속 존재하는한 계속 한다.
                if(list1.val > list2.val) {
                    temp.next = list2; //왜 이렇게 넣지
                    list2 = list2.next;
                } else{ // list1이 list2보다 작거나 같은 경우
                    temp.next = list1;
                    list1 = list1.next;
                }
                temp = temp.next;
            }
        if(list1 == null) {temp.next = list2;}
        else {temp.next = list1;}

        
        return result.next;
    }
}