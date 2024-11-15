
public class L2406 {
    public static void main(String[] args) {
        
        int[][] intervals = {{5,10},{6,8},{1,5},{2,3},{1,10}};
        if (intervals.length % 2 == 1){
        System.out.println(((int) (intervals.length/2))+1);
        }
        else if (intervals.length % 2 == 0){
            System.out.println(((int) (intervals.length/2)));
        }
    }
    
}
