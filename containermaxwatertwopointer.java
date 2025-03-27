import java.util.*;
public class containermaxwatertwopointer {
    public static int storewater(ArrayList<Integer>height){
        int maxwater=0;
        int i=0;
        int j=height.size()-1;
        while(i<j){
            int ht=Math.min(height.get(i),height.get(j));
            int width=j-i;
            int currwater=ht*width;
            maxwater=Math.max(maxwater,currwater);
            if(height.get(i)<height.get(j)){
                i++;
            }else{
                j--;
            }
           
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>(); 
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int ans=storewater(height);
        System.out.println(ans);
        
    }
    
}
