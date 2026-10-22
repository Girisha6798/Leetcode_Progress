class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp !=  null && temp.next != null){
            ListNode temp2 = temp.next;

            if(temp.val == temp2.val){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
           
        }
        return head;
    }
}