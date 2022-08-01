package Practice.basic_programs;
import java.util.*;

public class isPalindrome {
    public static boolean isPalindrome(String s){
        String s1="";
        int n = s.length()-1;
        for(int i=n ; i>=0 ; i--){
            s1+=s.charAt(i);
        }

        return s.equals(s1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // passing the value of integer as string to the function...
        System.out.println(isPalindrome(String.valueOf(n)));
    }
}
