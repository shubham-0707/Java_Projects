package Java_Problems.Java.com.example.Arrays;
import java.util.*;


// Program to find the missing number from the array using hash table....
public class missing_number_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n-1];

        for(int i=0 ; i<n-1 ; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer , Integer> hash = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            hash.put(arr[i] , 1);
        }

        int ans = 1;
        for(int i=1 ; i<=n ; i++){
            if(!hash.containsKey(i)){
                ans=i;
                break;
            }
        }

        System.out.println("Array do not contain : "+ans);
        return;
    }
}
