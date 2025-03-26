import java.util.*;
public class insertatend {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        }
        public static class linkedlist{
            Node head=null;
            Node tail=null;
            void insertatend(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=temp;
                }else{
                    tail.next=temp;
                 }
                tail=temp;
                
            }
            void display(){
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data +" ");
                    temp=temp.next;
                }
            }
            void insertatbegin(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=temp;
                    tail=temp;
                }else{
                    temp.next=head;
                    head=temp;
                }
            }
            int getelementat(int idx){
                 Node temp=head;
                 if(idx<0 || idx>size()){
                    System.out.println("wrong input");
                    return -1;
                 }
                 for(int i=1;i<=idx;i++){
                    temp=temp.next;
                 }
                 return temp.data;
            }
            void insertatmiddle(int idx,int val){
                Node t=new Node(val);
                Node temp=head;
                if(idx==size()){
                    insertatend(val);
                    return;
                }
                else if(idx==0){
                    insertatbegin(val);
                    return;
                }else if(idx<0 || idx>size()){
                    System.out.println("wrong input");
                    return;
                }

                for(int i=1;i<=idx-1;i++){
                    temp=temp.next;
                }
                t.next=temp.next;
                temp.next=t;
            }
            int size(){
               Node temp=head;
               int count=0;
               while(temp!=null){
                    count++;
                    temp=temp.next;
               }
               return count;
            }
            void deleteat(int idx){
                if(idx==0){
                    head=head.next;
                    return;
                }
                Node temp=head;
                for(int i=1;i<=idx-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                tail=temp;
            }
            
        }
       
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertatend(8);
        ll.insertatend(7);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        ll.insertatend(89);
        ll.display();
        System.out.println();
        ll.insertatbegin(34);
        ll.display();
        System.out.println();
        ll.insertatmiddle(2,23);
        ll.display();
        System.out.println();
        ll.insertatmiddle(1,20);
        ll.display();
        System.out.println();
        System.out.println(ll.tail.data);
        System.out.println();
        System.out.println(ll.getelementat(4));
        ll.insertatmiddle(0,100);
        ll.display();
        System.out.println();
        ll.deleteat(0);
        ll.display();
        System.out.println();
        ll.insertatend(12);
        ll.display();
        


    }
    
}
