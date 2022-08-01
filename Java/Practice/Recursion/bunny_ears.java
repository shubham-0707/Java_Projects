package Practice.Recursion;
import java.util.*;

// In this problem the total number of bunny ears is to be calculated using recursion....
public class bunny_ears {

    public static int calcBunnyEars(int n){
        if(n==0){
            return 0;
        }
        return 2+calcBunnyEars(n-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the n : ");
        n = sc.nextInt();

        System.out.println("The total number of ears are : "+calcBunnyEars(n));



    }
}
