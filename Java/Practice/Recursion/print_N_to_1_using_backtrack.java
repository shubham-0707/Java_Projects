package Practice.Recursion;
import java.util.*;


// This program is made to print the numbers from n to 1 using backtracking...
public class print_N_to_1_using_backtrack {
    public static void print(int i , int n){
        if(i>n){
            return;
        }
        print(i+1 , n);
        System.out.println(i);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(1 , n);
    }
}
