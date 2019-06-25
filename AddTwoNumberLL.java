public class AddTwoNumberLL {

    static Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){d = data; next = null;}
    }
    public Node addTwoNumbers(Node l1 , Node l2){
        int carry = 0;
        Node p , dummy = new Node(0);
        p = dummy;
        while (l1!= null || l2 != null || carry != 0){
            if(l1 != null){
                carry += l1.data;
                l1 = l1.next;
            }
            if(l2 != null){
                carry += l2.data;
                l2 = l2.next;
            }
            p.next = new Node(carry %10);
            carry /= 10;
            p = p.next;
        }

        return dummy.next;
    }

}
