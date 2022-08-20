/*

...Sigma of equation...

 */


package Practice.basic_programs;
import java.util.*;

public class sigma_of_equation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1 ; i<=n ; i++){

            sum += ((int)Math.pow((i+1) , 2) - (3*i + 1) + i);

        }

        System.out.println(sum);

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }

}
