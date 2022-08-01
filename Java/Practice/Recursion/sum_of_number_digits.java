package Practice.Recursion;
import java.util.*;


// This program is made to calculate the sum of the digits of a number ....
public class sum_of_number_digits {

    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n = sc.nextInt();

        System.out.println("The sum of the digits of the number is : "+sumOfDigits(n));


    }
}
