package Practice.Hashing;
import java.util.*;

// Program to find the intersection of two arrays using hashing...
public class intersection_of_two_arrays {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter array elements : ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter m : ");
        int m = sc.nextInt();

        System.out.println("Enter array2 elements : ");
        int[] arr2 = new int[m];
        for(int i=0 ; i<m ; i++){
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> hash = new HashSet<>();

        for(int i=0 ; i<n ; i++){
            hash.add(arr[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<m ; i++){
            if(hash.contains(arr2[i])){
                ans.add(arr2[i]);
            }
        }

        System.out.println("The intersection of the two arrays is : ");
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
