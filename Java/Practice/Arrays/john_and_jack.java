package Practice.Arrays;
import java.util.*;


// Program to find the last number of bricks placed...
public class john_and_jack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int x = 1;
        int temp = 0;
        int count = 0;
        int sumTemp = 0;
        int sum = 0;
        int i=1;

        while(true){
            if(i%2!=0){
                sumTemp = sumTemp + x;
                temp = x;
                x++;
            }
            else{
                sumTemp = sumTemp + 2*temp;
            }

            if(sumTemp>=n){
                break;
            }
            else{
                sum = sumTemp;
            }

            count++;
            i++;
        }

        int[] ans = new int[2];
        if(count%2==0){
            ans[0]=2;
        }
        else{
            ans[0] = 1;
        }
        ans[1] = n-sum;


        System.out.print("The resultant array is : ");
        for(int j=0 ; j<2 ; j++){
            System.out.print(ans[j] + " ");
        }


    }
}
