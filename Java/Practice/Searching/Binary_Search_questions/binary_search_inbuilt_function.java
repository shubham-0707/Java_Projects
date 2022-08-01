package Practice.Searching.Binary_Search_questions;
import java.util.*;

// Program to implement the binary search program using inbuilt function of binary search...
/* The time complexity of this program is O(logn)...*/
public class binary_search_inbuilt_function {
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Enter n array elements : ");
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key element : ");
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(arr , key);

        System.out.println("The index is : "+idx);
    }
}
