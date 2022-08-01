package Practice.Hashing;
import java.util.*;


// program to find the missing elements of a given range using hashmaps...
public class find_missing_elements_of_a_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int low = sc.nextInt();
        int high = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer , Integer> hash = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }

        for(int i=low ; i<=high ; i++){
            if(hash.containsKey(i)==false){
                System.out.print(i+" ");
            }
        }

    }
}
