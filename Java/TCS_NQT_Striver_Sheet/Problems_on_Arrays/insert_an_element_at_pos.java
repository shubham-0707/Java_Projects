
/*
In this question we have to insert an element at any position in the array...
 */

package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import  java.util.*;

public class insert_an_element_at_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declaring and initialising the array...
        int[] arr = new int[n+1];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position : ");
        int pos = sc.nextInt();
        System.out.println("Enter the element : ");
        int k = sc.nextInt();

        // modifying the array...

        for(int i=n ; i>=pos ; i--){
            arr[i] = arr[i-1];
        }

        arr[pos-1] = k;

        for(int i=0 ; i<=n ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
