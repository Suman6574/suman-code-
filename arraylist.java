import java.util.ArrayList;
//import java.util.*;
public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,9);
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +" ");
        }

        // get operation 0(1)
        int element =list.get(2);
        System.out.println(element);

        // remove operation
        list.remove(2);
        System.out.println(list); // 0(n)

        // setelement at index
        list.set(2,10);
        System.out.println(list);   //0(n)

        //contain element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}