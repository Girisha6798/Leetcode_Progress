class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0); // extra node kioki duplicate head bhi ho skta he 
        dummy.next = head;

        ListNode temp = dummy;

        while (temp.next != null && temp.next.next != null) {

            if (temp.next.val == temp.next.next.val) { // 3 == 3

                int stored = temp.next.val; // value store 

                while (temp.next != null && temp.next.val == stored) { 
                // jo temp ke next ki value h agr wo stored se match krti he then skip that 
                    temp.next = temp.next.next;
                }

            } else {
                temp = temp.next;
            }
        }

        return dummy.next;
    }
}