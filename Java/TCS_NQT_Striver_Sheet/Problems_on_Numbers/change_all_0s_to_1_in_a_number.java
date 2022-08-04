/*
In this question we have to change all the 0s to the 1s in the given number
 */


package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class change_all_0s_to_1_in_a_number {
    public static int reverse(int n){
        int sum = 0;
        while(n>0){
            sum=sum*10+n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        while(n>0){
            if(n%10==0){
                sum=sum*10+1;
            }
            else{
                sum=sum*10+n%10;
            }
            n/=10;
        }

        sum = reverse(sum);

        System.out.println("The modified number is : "+sum);

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
