package Practice.Arrays;
import java.util.*;

public class Count_Inversions {

    public static int merge(int[] arr , int start , int mid , int end){

        int inv_count = 0;
        int[] temp = new int[end-start+1];
        int i=start;
        int j = mid;
        int k=0;

        while(i<mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                ++k;
                ++i;
            }
            else{
                temp[k] = arr[j];
                ++k;
                ++j;
                inv_count+=(mid-i);
            }
        }

        while(i<mid) {
            temp[k] = arr[i];
            ++k;
            ++i;
        }

        while(j<=end){
            temp[k] = arr[j];
            ++k;
            ++j;
        }

        for(int x=0 ; x<temp.length ; x++){
            arr[x] = temp[x];
        }

        return inv_count;
    }

    public static int mergeSort(int[] arr , int start , int end){
        int inv_count = 0;

       if(end>start){
           int mid = start + (end-start)/2;
           inv_count+=mergeSort(arr , 0  , mid);
           inv_count+=mergeSort(arr , mid+1 , end);
           inv_count+=merge(arr , 0 , mid+1 , end);
       }

       return inv_count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(mergeSort(arr , 0 , arr.length-1));
        return;
    }
}
