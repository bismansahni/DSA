//taken from https://www.youtube.com/watch?v=cFRRgwPIk2s&list=PLUcsbZa0qzu0g_LceXxWu6ICc2o8SiAhJ&index=2
//inorder traversal follows rule of LNR that is left node right
//preorder traversal follows NLR node left right
// postorder traversal follows LRN left right node

import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class TreeTraversal {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("helo");
        Node root=createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();

    }

    static Node createTree() {

        System.out.println("Enter the root node");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        Node root = new Node(data);
        root = new Node(data);
        System.out.println("Enter the value of left node for " + data);
        root.left = createTree();
        System.out.println("Enter the value of  right for " + data);
        root.right = createTree();

        return root;

    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);

    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);

        postOrder(root.right);
        System.out.print(root.data + " ");

    }

}
