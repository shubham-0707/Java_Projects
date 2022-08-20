/*

...Move all negative numbers to one side of the array...

 */



package Love_Babbar_DSA_450.Array;
import java.util.*;

public class move_all_negative_number_to_one_side {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // now performing operations on array to transform it...
        int j=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }


        // the transformed array is :
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }


        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
