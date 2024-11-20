
import java.util.Arrays;
class Founded {
    public int[] arrayRankTransform(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int[] rank = new int[arr.length];
        int temp;
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j <=i; j++) {
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
       
        }
        int count = 0;
        for (int k = 0; k < rank.length; k++) {
            if (k < rank.length-1) {
                
                if(arr[k]!=arr[k+1] ){
                    count++;
                    rank[k] = count;
                }
                else if(arr[k] == arr[k+1] ){
                    rank[k] = count+1;
                    rank[k+1] = count+1;
                    
                }
            }
        }
        if(rank[rank.length-1]==0){
            rank[rank.length-1]= ++count;
        }
        System.out.println(Arrays.toString(arr));
    return rank;
    }

    public static void main(String[] args) {

        Founded obj = new Founded();

        int[] arr = {40,10,20,30,30,40,35,66};
        int[] res = obj.arrayRankTransform(arr);

        
        System.out.println(Arrays.toString(res));
}
        
    }