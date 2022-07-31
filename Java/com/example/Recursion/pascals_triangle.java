package Java_Problems.Java.com.example.Recursion;
import java.util.*;


// This program is written to print the pascals triangle pattern using recursion...
public class pascals_triangle {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Printing pascals triangle ....");

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j<=i ; j++){
                int nCr = fact(i)/(fact(i-j)*fact(j));
                System.out.print(" "+nCr);
            }
            System.out.println();
        }
    }

    // Time Complexity : O(n square)
    // Space Complexity : O(1)
}
