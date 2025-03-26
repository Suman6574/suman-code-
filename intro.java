import java.util.*;
public class intro{
    public static void insertatEnd(Node head,int val){
        Node temp=new Node(val);
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
        
    }
    public static void display(Node head){
        
        while(head!=null){
            System.out.print(head.data +" ");
            head=head.next;
        }
    }
    public static int count(Node a){
        int count=0;
        while(a!=null){
            count++;
            a=a.next;

        }
        return count;
    }
    // this function is for print the reverse linked list recursively
    public static void reverse(Node head){
        if(head==null){
            return;
        }
        reverse(head.next);
        System.out.print(head.data +" ");
    }
    // this function is for print the linked list recursively 
    public static void displayr(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data +" ");
        displayr(head.next);
    }
    // this function is for print the linked list
    public static void singlelinkedlist(Node head){
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data +" ");
           temp=temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
          this.data=data;
        }
    }
    
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        // Node temp=a;
        // for(int i=1;i<=5;i++){
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }
        // while(temp!=null){
        //     System.out.print(temp.data +" ");
        //     temp=temp.next;
        // }
        // singlelinkedlist(a);
        // displayr(a);
        //   reverse(a);
       System.out.println( count(a));
       insertatEnd(a,100);
       display(a);
    }
}