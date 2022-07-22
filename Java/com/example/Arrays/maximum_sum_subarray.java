package Java_Problems.Java.com.example.Arrays;
import java.util.*;


// This is the brute force solution of the maximum sum subarray...
public class maximum_sum_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter array elements : ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // from here the sum is found...
        int maxi = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                int sum = 0;
                for(int k = i ; k<=j ; k++){
                    sum+=arr[k];
                }
                maxi = Math.max(maxi , sum);
            }
        }

        System.out.println("The maximum sum of the subarray in the array is : "+maxi);
        return;

        // Time Complexity : O(n cube)
        // space Complexity : O(1)
    }
}
