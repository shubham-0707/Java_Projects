/*
in this question we have to check that the number is abundant or not...
 */


package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class check_if_a_number_is_abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1 ; i<n ; i++){
            if(n%i==0){
                sum+=i;
            }
        }

        if(sum>n){
            System.out.println("The number is abundant in nature");
            return;
        }
        System.out.println("The number is not abundant");

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
