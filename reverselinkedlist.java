import java.util.*;
public class reverselinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node reverse(Node head){
       if(head.next==null){
         return head;
       }
       Node newhead=reverse(head.next);
       head.next.next=head; // interchanging the connections
       head.next=null;
       return newhead;
    }
    public static void displayrev(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data +" ");
        displayrev(head.next);
       
        
        
    } 
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(6);
        Node e=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
         displayrev(a);
         System.out.println();
        a=reverse(a);
        displayrev(a);

    }
    
}
