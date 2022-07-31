/*

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.



Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3


Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times

 */


package Striver_Sheet_Solutions_DayWise.Day_2;
import java.util.*;

public class Find_the_duplicate_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        // Approach 1 : Brute Force is that using two nested loops..
        // Time Complexity : O(n square)
        // Space Complexity : O(1)

       /*

        for(int i=0 ; i<n ; i++){
           int count =1;
           for(int j=0 ; j!=i && j<n ; j++){
               if(arr[j]==arr[i]){
                   count++;
                   break;
               }
           }

           if(count==2){
               System.out.println(arr[i]);
               break;
           }
       }

        */

        // 2 Approach : Using HashMaps...

        // Time Complexity : O(n)
        // Space Complexity : O(n)

        /*

        HashMap<Integer , Integer> hash = new HashMap<>();
        for(int i : arr){
            hash.put(i , hash.getOrDefault(i , 0)+1);
        }

        for(int i: hash.keySet()){
            if(hash.get(i)==2){
                System.out.println(i);
            }
        }


         */


        // Approach 3 : Using some mind :
        // Intution : Basically we know that the array conatins elements from 1 to n-1 that's why sending each element to its value index ad then the element at the 0th index is our duplicate.

        while(arr[0]!=arr[arr[0]]){
            int temp = arr[arr[0]];
            arr[arr[0]] = arr[0];
            arr[0] = temp;
        }
        System.out.println("The duplicate element is : "+arr[0]);

        // Time Complexity : O(n)
        // Space Complexity : O(1)

    }
}
