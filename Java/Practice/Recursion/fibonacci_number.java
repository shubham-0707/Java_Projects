package Practice.Recursion;
import java.util.*;

// Program to find the nth fibonacci number using recursion....
public class fibonacci_number {

    public static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }

        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("The desired fibonacci number is : "+fibo(n));
    }
}
