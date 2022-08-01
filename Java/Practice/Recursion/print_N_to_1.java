package Practice.Recursion;
import java.util.*;

public class print_N_to_1 {
    public static void print(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print(n);
    }
}
