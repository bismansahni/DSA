class LinkedList {
    static class Node{
     int data;
     Node next;
     
      public Node(int data){
         this.data=data;
       
      }}
      public static void main(String[] args) {
         Node n1=new Node(0);
         Node n2= new Node(1);
         Node n3=new Node(3);
         Node n4=new Node(4);
         n1.next=n2;
         n2.next=n3;
         n3.next=n4;
         n4.next=null;
         Node current=n1;
         while(current!=null){
             System.out.println(current.data);
             current=current.next;
         }
         
 
      }
 }
 