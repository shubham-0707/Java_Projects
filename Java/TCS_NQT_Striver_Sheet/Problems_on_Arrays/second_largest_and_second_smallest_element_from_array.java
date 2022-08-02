
/*

In this question we have to find the second smallest and second-largest element from the array...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class second_largest_and_second_smallest_element_from_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }


        /* 1st Approach : Just sort the array and return the second last and second element from the
         array.
         But this approach has two flaws i.e. It is not valid if the array contains duplicate values..
         And also the time complexity of this approach is O(n*logn)

         */

        int maxi = arr[0];
        int second_maxi = arr[1];

        int mini = arr[0];
        int second_mini = arr[1];

        for(int i=0 ; i<n ; i++){
            if(arr[i]>maxi){
                second_maxi = maxi;
                maxi = arr[i];
            }
            else if(arr[i]>second_maxi && arr[i]<maxi){
                second_maxi = arr[i];
            }

            if(arr[i]<mini){
                second_mini = mini;
                mini = arr[i];
            }
            else if(arr[i]<second_mini && arr[i]>mini){
                second_mini = arr[i];
            }
        }

        System.out.println("The second minimum in the array is : "+second_mini);
        System.out.println("The second maximum in the array is : "+second_maxi);


        // Time Complexity : O(n)
        // Space Complexity : O(1) if we ignore the input..
    }
}
