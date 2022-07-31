/*

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:




Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]

 */



package Striver_Sheet_Solutions_DayWise.Day_1;
import java.util.*;

public class Pascals_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            //printing spaces for tree architecture..
            for(int j=0 ; j<n-i ; j++){
                System.out.print(" ");
            }
            //fixing C = 1 everytime because the first element of every line is 1:
            int C = 1;
            for(int j=1 ; j<=i ; j++){
                System.out.print(C+" ");
                C=C*(i-j)/j;
            }
            System.out.println();
        }

        // Time Complexity : O(n^2)
        // Space Complexity : O(1)
    }
}
