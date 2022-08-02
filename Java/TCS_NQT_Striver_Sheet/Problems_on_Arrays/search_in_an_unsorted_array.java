

/*

In this question we have to find the index of an element if it is present in the array

 */


package TCS_NQT_Striver_Sheet.Problems_on_Arrays;
import java.util.*;

public class search_in_an_unsorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising the array..

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key : ");
        int key = sc.nextInt();

        int index = -1;
        for(int i=0 ; i<n ; i++){
            if(arr[i]==key){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.out.println("The key is not present in the array ");
            return;
        }

        System.out.println("The key is not present in the array : "+index);


        // Time Complexity : O(n)
        // Space Complexity : O(1) if we ignore input..

    }
}
