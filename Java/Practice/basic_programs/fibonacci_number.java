package Practice.basic_programs;
import java.util.*;

public class fibonacci_number {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        n = sc.nextInt();

        int n0=0;
        int n1 = 1;
        System.out.println("Your Fibonacci Series is : ");
        System.out.println(n0);
        System.out.println(n1);

        int n2;
        for(int i=0 ; i<n-2 ; i++){
            n2 = n0+n1;
            System.out.println(n2);
            n0=n1;
            n1=n2;
        }

    }
}
