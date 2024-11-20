
public class L35 {
    // 35 earch Insert Position

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 11;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                break;
            }
            else if((arr[i]>target)){
                System.out.println(i);
                break;
            } 
            else if((i+1==arr.length)){
                System.out.println(i+1);
            }           
        }
      

    }
}
