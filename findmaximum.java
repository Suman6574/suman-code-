import java.util.ArrayList;
public class findmaximum {
   public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(11);
    list.add(12);
    list.add(14);
    list.add(10);
    list.add(10);
    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size()-1;i++){
        if(list.get(i)>max){
            max=list.get(i);
        }
    }
    System.out.println(max);
    
   } 
}
