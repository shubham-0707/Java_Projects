package Practice.Arrays;
import java.util.*;

// Program to check that how many elements are there which have occurred once in the array...
public class Equality_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[101];
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }

        int maxi = Integer.MIN_VALUE;

        for(int i=0 ; i<101 ; i++){
            maxi = Math.max(maxi , count[i]);
        }

        int cnt = n-maxi;

        System.out.println("The minimum number of elements to be removed : "+cnt);
    }
}
