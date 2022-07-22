package Java_Problems.Java.com.example.Arrays;
import java.util.*;


// This is the program to find the union of two arrays....
public class union_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int[] arr = new int[n];


        LinkedHashMap<Integer , Integer> hash = new LinkedHashMap<>();
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }

        int m = sc.nextInt();
        int[] array = new int[m];
        for(int i=0 ; i<m ; i++){
            array[i] = sc.nextInt();

            hash.put(array[i] , hash.getOrDefault(array[i] , 0)+1);
        }

        System.out.println("The union is : ");
        for(int i : hash.keySet()){
            System.out.print(i+" ");
        }
        return;

    }
}
