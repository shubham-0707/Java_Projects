/*

...Check that an array is a palindrome array...

 */


package Practice.Arrays;
import java.util.*;

public class palindrome_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declare and initialise an array...
        int[] arr = new int[n];
        //taking array input...
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }


        int start=0;
        int end = arr.length-1;

        while(start<end){
            if(arr[start]!=arr[end]){
                System.out.println(false);
                return;
            }
            start++;
            end--;
        }

        System.out.println(true);


    }
}
