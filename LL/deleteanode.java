/* 
  class Node {
    int data;
    Node next;
    Node(){}
    Node(int d) {
      data=d;
    }
  }
  The above class defines the linked list node.
*/
class Result {
  static void deleteNode(Node node) {
    if (node == null || node.next == null)
        return;
    node.data = node.next.data;
    node.next = node.next.next;
}
}