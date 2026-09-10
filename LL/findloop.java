class Result {
  static int loopInList(Node head) {
      Node slow = head;
      Node fast = head;
      while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
      if(fast == slow){
          int ct =1 ;
          Node temp = slow.next;
          while(temp != slow){
              ct++;
              temp = temp.next;
          } 
          return ct;
      }
  }
      return 0;
}
}