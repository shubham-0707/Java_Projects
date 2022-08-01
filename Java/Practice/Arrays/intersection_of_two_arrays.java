package Practice.Arrays;
import java.util.*;


// This program is made to find the intersection of the two arrays...
public class intersection_of_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }

        System.out.println("Enter m : ");
        int m = sc.nextInt();

        int[] array = new int[m];

        for(int i=0 ; i<m ; i++){
            array[i] = sc.nextInt();
            if(hash.containsKey(array[i]) && hash.get(array[i])>0){
                System.out.print(array[i]+" ");
                hash.put(array[i] , hash.get(array[i])-1);
            }
        }
        return;


    }
}
