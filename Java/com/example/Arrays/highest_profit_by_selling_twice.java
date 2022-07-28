package Java_Problems.Java.com.example.Arrays;
import java.util.*;

/*This program is made to calculate the maximum profit earned by the seller by selling the stocks twice
*
* The other stock can be sold only if the first one is already sold...*/
public class highest_profit_by_selling_twice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ;i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int mini1 = Integer.MAX_VALUE;
        int mini2 = Integer.MAX_VALUE;
        int maxi1 = 0;
        int maxi2 = 0;

        for(int  i=0 ; i<n ; i++){
            mini1 = Math.min(mini1 , arr[i]);
            maxi1 = Math.max(maxi1 , arr[i]-mini1);

            mini2 = Math.min(mini2 , arr[i]-maxi1);
            maxi2 = Math.max(maxi2 , arr[i]-mini2);
        }

        System.out.println("The maximum profit earned by seller by selling almost twice : "+maxi2);

        // Time Complexity : O(n)
        // Space Complexity : O(1) if input is ignored...
    }
}
