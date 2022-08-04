
/*

In this question we have to find the factors of a given number...

 */


package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class factors_of_a_given_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The factors are : ");
        for(int i=1 ; i<n ; i++){
            if(n%i==0){
                System.out.print(i+" , ");
            }
        }
        System.out.print(n);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }

}
