
/*

In this question I have to find the n fibonacci terms

 */

package TCS_NQT_Striver_Sheet.Problems_on_Numbers;
import java.util.*;

public class print_n_fibonacci_terms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n0 = 0;
        int n1 = 1;

        if(n==1){
            System.out.println(n0);
        }
        else if(n==2){
            System.out.println(n0);
            System.out.println(n1);
        }
        else{
            System.out.println(n0);
            System.out.println(n1);

            for(int i=0 ; i<n-2 ; i++){
                int n2 = n0+n1;
                System.out.println(n2);
                n0=n1;
                n1=n2;
            }
        }

    }
}
