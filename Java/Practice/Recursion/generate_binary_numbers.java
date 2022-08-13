/*
In this question I am going to generaet
 */

package Practice.Recursion;
import java.util.*;

public class generate_binary_numbers {

    public static String toBinary(int n){
        String ans = "";
        if(n==0){
            return "";
        }
        ans=ans+toBinary(n/2)+n%2;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // In this question we have to generate binary numbers up till n from 1...

        // we are going to store our answer in an ArrayList<String>

        ArrayList<String> ans = new ArrayList<>();
        for(int i=1 ; i<=n ; i++){
            String str = toBinary(i);
            ans.add(str);
        }

        //now printing the answer..
        for(int i=0 ; i<n ; i++){
            System.out.println(i+1+"--->"+ans.get(i));
        }

        // Time Complexity : O(n*log(n))
        // Space Complexity : O(n) to store the answer.
    }
}
