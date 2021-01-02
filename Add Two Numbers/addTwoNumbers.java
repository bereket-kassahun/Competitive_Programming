 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int current = 0;
        int n1 = 0;
        int n2 = 0;
        ListNode head = new ListNode();
        ListNode ret = head;
        while(l1 != null || l2 != null){
            n1 = 0;
            n2 = 0;
            if(l1!= null){
                 n1 = l1.val;
                l1 = l1.next;
            }
               
            if(l2 != null){
               n2 = l2.val;
                l2 = l2.next;
            }
                
            int sum = n1 + n2 + carry;
            current = sum % 10;
            carry = sum/ 10;
            
            head.next = new ListNode(current);
            
            head  = head.next;
        }
        
        if(carry != 0){
            head.next = new ListNode(carry);
        }
        return ret.next;
}