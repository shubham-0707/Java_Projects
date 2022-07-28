package Java_Problems.Java.com.example.Arrays;
import java.util.*;

public class best_time_to_buy_and_sell_stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int minSoFar = arr[0];
        int maxi = 0;

        for(int i=0 ; i<n ; i++){
            minSoFar = Math.min(minSoFar , arr[i]);
            int profit = arr[i] = minSoFar;
            maxi = Math.max(maxi , profit);
        }

        System.out.println("The maximum profit that a person can get is : "+maxi);
        return;
    }
}
