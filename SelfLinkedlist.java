// i tried to implement linkedlist in java where the user prints how many elements he wants and then does the linked list
// the error for the nextInt is in this video https://www.youtube.com/watch?v=fJLHKbVx-YQ
// for someone reason it doesnt work directly on running so run it through terminal instead


import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data, Node next) { // this is fine but mostly nodes just make a rule to just put the data in node "next is not neccessary"
        this.data = data;
        this.next = next;
    }
}

public class SelfLinkedlist {
    static Scanner sc = null;

    public static void main(String[] args) {
       sc=new Scanner(System.in);
        System.out.println("hello world");
        createLinkedList(); // Call the method to create a linked list
    }

    static void createLinkedList() {
        System.out.println("press insert list");
        String input = sc.nextLine();
        Node head = null;
        Node current = null;

        if (input.equals("insert")) {
            System.out.println("how many elements linked list do you want: ");
            int number = sc.nextInt();
            sc.nextLine(); // Consuming the trailing newline -- this error is explained inn the video linked on top

            for (int i = 1; i <= number; i++) {
                System.out.println("enter the element to insert: ");
                int element = sc.nextInt();
                sc.nextLine(); // Consuming the trailing newline

                Node newNode = new Node(element, null);
                if (head == null) {
                    head = newNode;
                } else {
                    current.next = newNode;
                }
                current = newNode;
            }

            // Print the linked list
            current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}
