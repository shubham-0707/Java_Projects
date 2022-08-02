

/*

In this question we have to calculate the average of all the elements of the array...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class Average_of_all_elements_of_an_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising the array...

        int[] arr = new int[n];
        for(int i=0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        double avg = 0;
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum+=arr[i];
        }

        avg = sum/(n*1.0);

        System.out.println("The average of the array elements is : "+avg);

        // Time Complexity : O(n)
        // Space Complexity : O(1) if the input is ignored..

    }

}
