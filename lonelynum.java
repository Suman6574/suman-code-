import java.util.*;
public class lonelynum {
    public static List<Integer> findlonely(ArrayList<Integer>nums){
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums ){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        List<Integer> result=new ArrayList<>();
        for(int num:freq.keySet()){
            if(freq.get(num)==1 &&  !freq.containsKey(num - 1) && !freq.containsKey(num + 1) ){
                result.add(num);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>(); 
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(findlonely(nums));

    }
    
}
