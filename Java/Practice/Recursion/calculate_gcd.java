package Practice.Recursion;
import java.util.*;

// Program to calculate the gcd of two numbers...
public class calculate_gcd {

    public static int gcd(int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a , a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();

        System.out.println("The gcd of two numbers are : "+gcd(a , b));
    }
}
