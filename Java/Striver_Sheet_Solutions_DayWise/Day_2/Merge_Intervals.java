/*

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


Constraints:

1 <= intervals.length <= 10^4
intervals[i].length == 2
0 <= start <= end <= 10^4

 */


package Striver_Sheet_Solutions_DayWise.Day_2;
import java.util.*;

public class Merge_Intervals {

    public static int[][] mergeIntervals(int[][] arr){
        Arrays.sort(arr , (a , b)->a[0]-b[0]);

        // Making a linked list of the arrays...
        LinkedList<int[]> result = new LinkedList<>();
        for(int[] row : arr){

            // if the linked list is empty or the last array in the list is disjoint..
            if(result.isEmpty() || result.getLast()[1]<row[0]){
                result.add(row);
            }

            // if the last array in the list is not disjoint...
            else{
                result.getLast()[1] = Math.max(row[1] , result.getLast()[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declaring and initialising the 2D array.

        int[][] arr = new int[n][2];

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // catching and printing the answer array from  the function
        int[][] ans = mergeIntervals(arr);
        for(int i=0 ; i<ans.length ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

        // Time Complexity : O(n*logn)
        // Space Complexity : O(n)
    }
}
