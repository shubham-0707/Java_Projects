/*

...Matrix is sparse or not...

 */


package Practice.Arrays;
import java.util.*;

public class is_sparse_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int countZero = 0;
        int countNonZero=0;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(arr[i][j]==0) countZero++;
                else countNonZero++;
            }
        }

        if(countZero>countNonZero){
            System.out.println("Sparse Matrix");
            return;
        }
        System.out.println("Not Sparse Matrix");

        // Time Complexity : O(N^2)
        // Space Complexity : O(1)


    }
}
