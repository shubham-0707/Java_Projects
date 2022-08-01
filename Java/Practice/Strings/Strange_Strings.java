package Practice.Strings;
import java.util.*;


// This program is made to generate a strange string such that :
// Insert the first character in the beginning of string, the second in the end, the third in the beginning, fourth in the end, and so on.
//  The first character should be a, followed by b, c, and so on. z will be followed by a


public class Strange_Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        char[] arr = new char[]{'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' , 'o' ,'p' , 'q' , 'r' , 's' , 't' ,'u' , 'v' , 'w' ,'x' , 'y' , 'z'};

        String ans = "";
        for(long i=1 ; i<=n ; i++){
            if(i%2==1){
                ans=arr[(int)(i-1)%26] + ans;
            }
            else{
                ans+=arr[(int)(i-1)%26];
            }
        }

        System.out.print(ans);
    }
}
