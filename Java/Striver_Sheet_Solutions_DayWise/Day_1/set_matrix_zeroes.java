
/* Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

        You must do it in place.



        Example 1:
        Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
        Output: [[1,0,1],[0,0,0],[1,0,1]]


        Example 2:
        Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]] */

package Striver_Sheet_Solutions_DayWise.Day_1;
import java.util.*;

public class set_matrix_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // from here the main operations start...

        boolean firstRow = false;
        boolean firstCol = false;

        //checking if the first row contains any zero.
        for(int i=0 ; i<n ; i++){
            if(arr[0][i]==0){
                firstRow=true;
                break;
            }
        }

        // checking if the first column contains any zero.
        for(int i=0 ; i<m ; i++){
            if(arr[i][0]==0){
                firstCol=true;
                break;
            }
        }

        /* Checking from the second row and second column and making the first row amd column as indicator
        to fix the row values and column values as zero.
         */
        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j<n ; j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        /* Checking if the first row or the first column is zero of the 2D array...
        if that is zero then set the entire row and column as zero.
         */
        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j<n ; j++){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j] = 0;
                }
            }
        }

        /*
        if the first column is zero then set the column elements as zero.
         */
        if(firstCol){
            for(int i=0 ; i<arr.length ; i++){
                arr[i][0] = 0;
            }
        }

        /*
        If the first row is zero then set the row elements as zero.
         */
        if(firstRow){
            for(int i=0 ; i<arr[0].length ; i++){
                arr[0][i] = 0;
            }
        }

        // printing the entire resultant 2D array.
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Time Complexity : O(n square)
        // Space Complexity : O(1) if input is ignored.
    }
}
