/* 
 *  class Node {
 *    int data;
 *    Node next;
 *  };
 *
 *  The above class defines the linked list node.
 */
// Return the head of updated list
static Node shiftSmallLarge(Node head) {
  // Write your code here
    if(head == null || head.next == null) return head;
    Node min = head;
    Node minp = null;
    Node temp = head;
    Node prev = null;
    while(temp != null){
        if(temp.data < min.data){
            min = temp;
            minp = prev;
        }
        prev = temp;
        temp = temp.next;
    }
    if(min != head){
        minp.next = min.next;
        min.next = head;
        head = min;
    }
    Node max = head;
    Node maxp = null;
    temp = head;
    prev = null;
    while(temp != null){
        if(temp.data > max.data){
            max = temp;
            maxp = prev;
        }
        prev = temp;
        temp = temp.next;
    }
    if(max == head){
        head = head.next;
    } else {
        maxp.next = max.next;
    }
    temp = head;
    while (temp.next != null)
        temp = temp.next;
    temp.next = max;
    max.next = null;
    return head;
}