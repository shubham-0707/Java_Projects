/*

...In this question we have to find the factorial of a large number....

//     1<=N<=1000

 */




package Love_Babbar_DSA_450.Array;
import java.util.*;

public class find_factorials_of_a_big_integer {

    public static void findFactorial(int n , ArrayList<Integer> ans){

        ans.add(1);

        for(int i=2 ; i<=n ; i++){
            int carry = 0;
            for(int j=0 ; j<ans.size() ; j++){
                int val = ans.get(j)*i + carry;
                ans.set(j , val%10);
                carry = val/10;
            }

            while(carry!=0){
                ans.add(carry%10);
                carry/=10;
            }
        }
        Collections.reverse(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> ans = new ArrayList<>();

        findFactorial(n , ans);

        // printing the answer...

        System.out.println("The factorial is : ");
        for(int i=0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i));
        }

        // Time Complexity : O(N) since inner while loop will run for a very small time...
        // Space Complexity : O(1)

    }
}
