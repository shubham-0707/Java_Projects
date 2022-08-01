package Practice.Sorting;
import java.util.*;

// In this question the range is -100<=arr[i]<=100

public class count_sort_with_negative_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n : ");
        n = sc.nextInt();

        System.out.println("Enter n elements between -100 to 100 : ");
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int[] count = new int[201];

        for(int i=0 ; i<n ; i++){
            count[arr[i]+100]++;
        }



        int k=0;
        for(int i=0 ; i<201 ; i++){
            if(count[i]>0){
                while(count[i]-- > 0){
                    arr[k]=i-100;
                    k++;
                }
            }
        }

        System.out.println("The sorted array is : ");
        for(int i:arr){
            System.out.print(i + " ");
        }



    }

}
