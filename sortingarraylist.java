import java.util.ArrayList;
import java.util.Collections;
public class sortingarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(14);
        list.add(10);
        list.add(9);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //descending order 
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
