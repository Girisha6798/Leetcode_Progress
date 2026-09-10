static Node copyList(Node head) {
  // Write your code here
    if(head == null) return null;
    Node newnode = new Node(head.data);
    newnode.next = copyList(head.next);
    return newnode;
}