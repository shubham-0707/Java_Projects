

/*
Check if a number is perfect...

 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class check_if_a_number_is_perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1 ; i<n ; i++){
            if(n%i==0){
                sum+=i;
            }
        }

        if(sum==n){
            System.out.println("The number is a perfect number");
        }
        else{
            System.out.println("The number is not a perfect number");
        }
    }
}
