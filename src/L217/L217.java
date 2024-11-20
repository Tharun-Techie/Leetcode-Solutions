package src.L217;
import java.util.HashSet;
import java.util.Set;

public class L217 {
    static boolean Solution(int[] nums){
        // taking hashset to store unique values
        Set<Integer> val = new HashSet<>();
        //iterating it
        for(int arr: nums){
            if ( val.contains(arr)== false){
                val.add(arr);
            }
            else if (val.contains(arr) == true){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,4,1};
        System.out.println(Solution(nums));
    }

}
