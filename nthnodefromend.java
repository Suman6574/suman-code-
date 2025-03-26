import org.w3c.dom.Node;

public class nthnodefromend {
    //find nth node from the last of the linked list
    public static Node nthnode(Node head,int n){
         int size=0;
         Node temp=head;
         while(temp!=null){
            size++;
            temp=temp.next;
         }
        int m=size-n+1;
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;

    }
    // delete the nth element from the last of the  linked list
    public static Node deletenthnode(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
          slow.next=slow.next.next;
          return head;
    }
    // find nth from last of the linked list in one traversal
    public static Node nthnode2(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
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
        Node f=new Node(18);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        // Node q=nthnode(a,2);
        // System.out.println(q.data);
        // Node q=nthnode2(a,4);
        // System.out.println(q.data);
        display(a);
        a=deletenthnode(a, 6);
        display(a);
    }
    
}
