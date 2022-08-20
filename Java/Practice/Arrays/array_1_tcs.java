/*
...Count array...
 */

package Practice.Arrays;
import java.util.*;

public class array_1_tcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=1 ; i<n ; i++){
            if(arr[i]!=arr[0]){
                count++;
            }
        }

        System.out.println(count);
    }
}
