package Big_Oh_Assignment;
import java.util.*;

public class fibonacci_number_recursive {

    public static int fibo(int n){
        if(n<=1) return n;

        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The nth fibonacci number is : "+fibo(n-1));

    }
}
