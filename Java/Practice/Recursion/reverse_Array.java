package Practice.Recursion;
import java.util.*;

public class reverse_Array {

    public static int[] reverse_arr(int[] arr , int l , int r){
        if(l>=r){
            return arr;
        }

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return reverse_arr(arr , l+1 , r-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = reverse_arr(arr , 0 , arr.length-1 );
        for(int i=0 ; i<n ; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
