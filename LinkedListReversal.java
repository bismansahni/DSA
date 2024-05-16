 /**
see remember for linkedlist reversal we have to assume three nodes in line a, b and c. if we take  b to be the head node then a will be the null node and c will be the one
pointing next to b. so now, we have to basically first assign a to null. b to the current head. now we enter while loop and make the c node now, whicj
will be c=b.next   now we will point the b node to the previous node so b.next=a and then a will become the current node so a=b and b becomes the next node so b=c . now we run this all in the loop. this is how to reverse a linkedlist.
 */

public class LinkedListReversal {
   
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node reverse(Node head) {
        Node a = null;
        Node b = head;
        while (b != null) {
            Node c = b.next;
            b.next = a;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node n2 = new Node(4);
        Node n3 = new Node(5);
        head.next = n2;
        n2.next = n3;

        System.out.print("Original list: ");
        printList(head);

        Node reversed = reverse(head);

        System.out.print("Reversed list: ");
        printList(reversed);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.data);
            } else {
                System.out.print(current.data + "-> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}


