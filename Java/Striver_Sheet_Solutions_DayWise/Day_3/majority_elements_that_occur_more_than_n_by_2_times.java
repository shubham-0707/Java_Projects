/*
In this question we have to find the element that occurs more than n/2 times in the array..

Example 1:

Input Format: N = 3, nums[] = {3,2,3}

Result: 3

Explanation: When we just count the occurrences of each number and compare with half of the size of the array, you will get 3 for the above solution.

Example 2:

Input Format:  N = 7, nums[] = {2,2,1,1,1,2,2}

Result: 2

Explanation: After counting the number of times each element appears and comparing it with half of array size, we get 2 as result.

Example 3:

Input Format:  N = 10, nums[] = {4,4,2,4,3,4,4,3,2,4}

Result: 4

 */


package Striver_Sheet_Solutions_DayWise.Day_3;
import java.util.*;

public class majority_elements_that_occur_more_than_n_by_2_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising the array...
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        /*
        Approach 1 : Brute Force Approach

        we will use two loops to search for the element having more than n/2 count in tyhe array..

        //Time Complexity : O(n^2)
        // Space Complexity : O(1)
         */

        /*
        Approach 2 : Use a hashmap to store the count of the elements of the array and then by traversing
        the array we can get the required number ...

        // Time Complexity : O(N)
        // Space Complexity : O(N)
         */

        /*
        Approach 3 : Use Moore Voting Algorithm..

        // Time Complexity : O(N)
        // Space Complexity : O(1)
         */


        // we are going to use Moore Voting Algorithm...

        int candidate = 0;
        int count = 0;

        for(int i=0 ; i<n ; i++){
            if(count==0){
                candidate=arr[i];
            }

            if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println("The number that appear more than n/2 times is : "+candidate);
    }
}
