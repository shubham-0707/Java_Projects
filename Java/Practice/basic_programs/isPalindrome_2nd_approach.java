package Practice.basic_programs;
import java.util.*;

public class isPalindrome_2nd_approach {

    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;

        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println(isPalindrome(String.valueOf(n)));
    }
}
