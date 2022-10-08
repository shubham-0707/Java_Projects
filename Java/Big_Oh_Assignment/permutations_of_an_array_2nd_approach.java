package Big_Oh_Assignment;
import java.util.*;

public class permutations_of_an_array_2nd_approach {

    public static void swap(int[] arr , int index , int point){
        int temp = arr[index];
        arr[index] = arr[point];
        arr[point] = temp;
    }

    public static void solve(int[] arr , int index){
        if(index==arr.length){
            for(int i=0 ; i<arr.length ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=index ; i<arr.length ; i++){
            swap(arr , index , i);
            solve(arr , index+1);
            swap(arr , index , i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        solve(arr , 0);

    }
}
