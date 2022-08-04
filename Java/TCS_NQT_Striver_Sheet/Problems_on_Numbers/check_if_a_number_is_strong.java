/*
in this question we have to check that a number is strong or not...
 */


package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class check_if_a_number_is_strong {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int temp = n;

        int sum = 0;
        while(n>0){
            int res = n%10;
            sum+=fact(res);
            n=n/10;
        }

        if(sum==temp){
            System.out.println("The number is strong ");
        }
        else{
            System.out.println("The number is not strong ");
        }
    }
}
