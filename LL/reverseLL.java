class Result {
  // Return the new head of reversed list
  static Node reverseList(Node head) {
      // Node ct = head;
      Node ct = head;
      Node prev = null;
      while(ct != null){
          Node next = ct.next;
          ct.next = prev;
          prev = ct;
          ct = next;
      }
    return prev;
  }
}