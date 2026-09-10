class Result {
  static Node addListNumbers(Node head1, Node head2) {
    Node dummy = new Node(0);
    Node temp = dummy;
    int carry = 0;
    while (head1 != null || head2 != null || carry != 0) {
        int a = 0;
        int b = 0;
        if (head1 != null)
            a = head1.data;
        if (head2 != null)
            b = head2.data;
        int sum = a + b + carry;
        carry = sum / 10;
        temp.next = new Node(sum % 10);
        temp = temp.next;
        if (head1 != null)
            head1 = head1.next;
        if (head2 != null)
            head2 = head2.next;
    }
    return dummy.next;
}
}