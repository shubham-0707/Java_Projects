package Practice.Recursion;
import java.util.*;


// This program is made to print the name of the user n times using recursion...
public class print_name_n_times {

    public static void print(int i , int n  , String name){
        if(i>n){
            return;
        }
        System.out.println(name);
        print(i+1 , n , name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter String : ");
        String str = sc.next();

        print(1 , n , str);
    }

}
