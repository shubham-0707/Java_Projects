package Java_Problems.Java.com.example.Arrays;
import java.util.*;


// This program is made to find the maximum sum of the subarray of the array using the kadanes algorithm...

/* Intution: The main intution of this problem is that in this problem we dont want that that the sum of the
* array elements is less than 0 */
public class Kadanes_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // Kadane's Algorithm start from here...

        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            sum=sum+arr[i];
            if(sum>maxi){
                maxi=sum;
            }

            if(sum<0){
                sum=0;
            }

        }

        System.out.println("The maximum sum of the subarray in the array is : "+maxi);
        return;

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
