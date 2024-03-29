package Practice.Arrays;
import java.util.*;

public class relative_ranks {

    public static int binary_search(int[] arr , int key){
        int start = 0;
        int end = arr.length-1;

        int index = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==key){
                index = mid;
                break;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n :");
        n = sc.nextInt();

        int score[] = new int[n];
        for(int i=0 ; i<n ; i++){
            score[i] = sc.nextInt();
        }

        int arr[] = new int[score.length];
        for(int i=0 ; i<score.length ; i++){
            arr[i] = score[i];
        }

        Arrays.sort(arr);

        String ans[] = new String[arr.length];

        for(int i=0 ; i<arr.length ; i++){
            int idx = binary_search(arr , score[i]);

            if(idx==arr.length){
                ans[i]="Gold Medal";
            }
            else if(idx==arr.length-1){
                ans[i] = "Silver Medal";
            }
            else if(idx==arr.length-2){
                ans[i] = "Bronze Medal";
            }
            else{
                ans[i] = Integer.toString(arr.length-idx+1);
            }
        }


        for(String i:ans){
            System.out.print(i+" ");
        }
    }
}
