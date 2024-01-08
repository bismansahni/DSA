

// this is the creation of trees in java 
// this was taken from the video of https://www.youtube.com/watch?v=QhIM-G7FAow

import java.util.Scanner;
class Node{
    Node left;
    Node right;
    int data;

    public Node(int data){
        this.data=data;
        
    }

}

public class TreesImplementation {
    static Scanner sc=null;
    public static void main(String[] args) {
       
       sc=new Scanner(System.in);
        System.out.println("hello");
        createTree();

    }

    static Node createTree(){
        Node root=null;
        System.out.println("Enter data: ");
        int data=sc.nextInt();
        if(data==-1) return null;
        root =new Node(data);
        System.out.println("Enter data for left: "+data);
        root.left=createTree();
        System.out.println("Enter data for right: "+data);
        root.right=createTree();



        return root;

    }


}

