package Java_Problems.Java.com.example.Arrays;
import java.util.*;

public class find_duplicate_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
         /* Intution: Since we know that the number of elements are n+1 from 1 to n thats why we can shift the..
         elements to their respective positions and then at last the element at 0th index will be the duplicate number...*/


        while(arr[0]!=arr[arr[0]]){
            int temp = arr[arr[0]];
            arr[arr[0]] = arr[0] ;
              arr[0] = temp;
        }

        System.out.println("The duplicate number is : "+arr[0]);
        return;
    }

    // Time Complexity : O(n) (worst case)
    // Space Complexty : O(1)

    // But this requires a little bit array modification...

}
