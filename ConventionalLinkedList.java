// this file I created after SelfLinkedList.java where I am trying to use just data as a conventional Node class 

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class ConventionalLinkedList {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("hello world");
        LinkedList();
    }

    static void LinkedList() {
        System.out.println("Enter how many elements do you want: ");
        int input = sc.nextInt();
        sc.nextLine();
        Node head = null;
        Node current = null;

        for (int i = 1; i <= input; i++) {
            System.out.println("Enter the element:");
            int finalinput = sc.nextInt();
            sc.nextLine();
            Node newNode = new Node(finalinput);

            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }

        // Print the linked list after it's fully created
        current = head;
        System.out.println("The elements of the linked list are:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
