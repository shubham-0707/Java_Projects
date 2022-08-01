package Practice.Arrays;
import java.util.*;


// In this problem array elements are there from 1 to n and we have to find the repeated element in an array of n+1 elements...
public class find_the_duplicate_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        int ans = -1;
        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
            if(hash.get(arr[i])>1){
                ans=arr[i];
                break;
            }
        }

        System.out.println("The answer is : "+ans);
        return;


    }
}
