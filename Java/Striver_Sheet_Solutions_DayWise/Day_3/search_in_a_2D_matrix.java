/*
In this question we have to search in a 2D matrix which is sorted in row wise and the last element in every row
is smaller than the first element of every other row..

Example 1:

Input: matrix =
[[1,3,5,7],
 [10,11,16,20],
 [23,30,34,60]],

target = 3

Output: true

Explanation: As the given integer(target) exists in the given 2D matrix, the function has returned true.
Example 2:

Input: matrix =
[[1,3,5,7],
 [10,11,16,20],
 [23,30,34,60]],

target = 13

Output: false

Explanation: As the given integer(target) does not exist in the given 2D matrix, the function has returned false.
 */

package Striver_Sheet_Solutions_DayWise.Day_3;
import java.util.*;

public class search_in_a_2D_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("Enter m : ");
        int m = sc.nextInt();

        // declaring and initialising the 2D array...

        int[][] arr = new int[n][m];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter key : ");
        int target = sc.nextInt();

        /*
        The first approach is to check using the 2 loops one inside other to search for the element
        but..

        // Time Complexity : O(n square)
        // Space Complexity : O(1)
         */

        /*
        Applying Binary Search when we know that the matrix...

        // Time Complexity : O(log(m*n))
        // Space Complexity : O(1)

         */

        int start = 0;
        int end = n*m-1;
        int index = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            int ints = mid / arr[0].length;

            if(arr[ints][mid%arr.length]==target){
                index = mid;
                break;
            }
            else if(arr[ints][mid%arr.length]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        System.out.println("The index is : "+index);
    }
}
