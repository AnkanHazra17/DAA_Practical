
import java.util.Arrays;

public class Solution{

    public static int[] frequency(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            maxi = Math.max(maxi, arr[i]);
        }

        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            mini = Math.min(mini, arr[i]);
        }

        int[] count = new int[maxi - mini + 1];

        for(int i = 0; i < arr.length; i++){
            int ind = arr[i] - mini;
            count[ind]++; 
        }

        return count;
    }


    public static void main(String[] args) {
        int[] arr = {11, 2, 4, 4, 4, 4 , 11, 2, 6, 3, 9, 3, 9, 5, 5};
        System.out.println("original Array");
        System.out.println(Arrays.toString(arr));
        System.out.println("Frequency Array");
        System.out.println(Arrays.toString(frequency(arr))); 
    }
}

