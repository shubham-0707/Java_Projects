package Practice.Recursion;
import java.util.*;


// program to calculate the factorial of a number using recursion....


public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the n : ");
        n = sc.nextInt();

        System.out.println("The factorial of "+n+" is "+fact(n));
    }
}
