package Big_Oh_Assignment;
import java.util.*;

public class print_count_of_subsequence_having_sum_K {

    public static int subsequence(int[] arr , int index , int new_sum , int sum){
        if(index>=arr.length){
            if(new_sum==sum){
                return 1;
            }
            return 0;
        }

        new_sum+=arr[index];
        int l = subsequence(arr , index+1 , new_sum , sum);

        new_sum-=arr[index];
        int r = subsequence(arr , index+1 , new_sum , sum);

        return l+r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the sum required : ");
        int sum = sc.nextInt();

        System.out.println("The count is : "+subsequence(arr , 0 , 0 , sum));
    }
}
