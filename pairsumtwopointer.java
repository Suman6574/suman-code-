import java.util.*;
public class pairsumtwopointer {
    public static boolean pairsum(ArrayList<Integer>list,int target){
          int i=0;
          int j=list.size()-1;
          while(i<=j){
             if(list.get(i)+list.get(j)==target){
                return true;
            }
            if(list.get(i)+list.get(j)<target){
                i++;
            }else{
                j--;
            }
            
          }
          return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(); 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target=5;
        boolean ans=pairsum(list, target);
        System.out.println(ans);
    }
    
}
