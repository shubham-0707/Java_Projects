package Practice.Arrays;
import java.util.*;


// This program is made to merge two arrays without using extra space...
public class merge_two_sorted_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] temp = new int[m];
        for(int i=0 ; i<m ; i++){
            temp[i] = sc.nextInt();
        }

        // Here merging operation happens...

        int i = 0;
        int j=0;
        int k=n-1;

        while(i<=k && j<m){
            if(arr[i]<temp[j]){
                i++;
                continue;
            }
            else{
                int tem = arr[k];
                arr[k] = temp[j];
                temp[j] = tem;
                j++;
                k--;
            }
        }

        Arrays.sort(arr);
        Arrays.sort(temp);

        System.out.println("The sorted arrays are...");

        for(int x=0 ; x<n ; x++){
            System.out.print(arr[x]+" ");
        }

        for(int x=0 ; x<m ; x++){
            System.out.print(temp[x]+" ");
        }

        return;
    }
}
