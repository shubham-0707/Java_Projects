package Practice.Strings;
import java.util.*;

// In this program the kth character to be found when the pattern is like 0 , 01 , 0110 , 01101001 .....etc

// firstly we have to find the pattern for kth step and then the kth character is to be printed...
public class Kth_symbol_in_grammar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n : ");
        n = sc.nextInt();

        String str = "1";
        String ans = "";
        for(int i=1 ; i<=n ; i++){
            String temp = "";
            for(int j=0 ; j<str.length() ; j++){
                if(str.charAt(j)=='0'){
                    temp = temp + "1";
                }
                else{
                    temp = temp +"0";
                }
            }
            ans = ans+temp;
            str=ans;
        }
        System.out.println("The pattern is : "+ans);

        System.out.print("Enter k : ");
        int k = sc.nextInt();
        System.out.println("ans : "+ans.charAt(k-1));
    }
}
