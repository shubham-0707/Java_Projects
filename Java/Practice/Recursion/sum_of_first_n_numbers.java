package Practice.Recursion;
import java.util.*;


public class sum_of_first_n_numbers {

    public static long sum(long n){
        if(n<1){
            return 0;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();


        System.out.println("The sum of first n numbers is : "+sum(n));
    }
}
