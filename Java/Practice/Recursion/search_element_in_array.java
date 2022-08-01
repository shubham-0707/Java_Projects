package Practice.Recursion;
import java.util.*;


// Program to find search an element in the array using recursion......
public class search_element_in_array {
    public static int search_in_array(int[] arr , int key , int idx){
        if(idx==arr.length){
            return -1;
        }
        else if(arr[idx]==key){
            return idx;
        }
        return search_in_array(arr , key  , idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key : ");
        int key = sc.nextInt();
        System.out.println("The index is : "+search_in_array(arr , key , 0));
    }

}
