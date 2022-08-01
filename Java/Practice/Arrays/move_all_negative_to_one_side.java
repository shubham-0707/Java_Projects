package Practice.Arrays;
import java.util.*;


// This program is made to move all the negative elements to one side of the array...
public class move_all_negative_to_one_side {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int j=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]<0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }


        System.out.println("The modified array is : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
