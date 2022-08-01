package Practice.Arrays;
import java.util.*;


// This program is made to find out the minimum steps required to make the product of the array equals to 1...
public class minimum_steps_to_make_product_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int neg_count = 0;
        int zero_count = 0;
        int steps = 0;

        for(int i=0 ; i<n ; i++){
            if(arr[i]<0){
                steps+=Math.abs(arr[i])-1;
                neg_count++;
            }
            else if(arr[i]>0){
                steps+=arr[i]-1;
            }
            else{
                zero_count++;
            }
        }

        if(neg_count%2!=0 && zero_count==0){
            steps+=2;
        }
        steps+=zero_count;

        System.out.println("The total number of minimum steps required is : "+steps);
        return;
    }
}
