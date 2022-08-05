/*
In this question we have to check that which elements in the array are appearing in the array more than
n/3 times...

Example 1:

Input: N = 5, array[] = {1,2,2,3,2}

Ouput: 2

Explanation: Here we can see that the Count(1) = 1, Count(2) = 3 and Count(3) = 1.Therefore, the count of 2 is greater than N/3 times. Hence, 2 is the answer.
Example 2:

Input:  N = 6, array[] = {11,33,33,11,33,11}

Output: 11 33

Explanation: Here we can see that the Count(11) = 3 and Count(33) = 3. Therefore, the count of both 11 and 33 is greater than N/3 times. Hence, 11 and 33 is the answer.

 */


package Striver_Sheet_Solutions_DayWise.Day_3;
import java.util.*;

public class find_the_elements_that_appear_more_than_n_by_3_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declaring and initialising the array..
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        /*
        Approach 1 : In this approach we can use 2 loops to check the count of every element and then return the answer..

        // Time Complexity : O(N)
        // Space Complexity : O(1)

         */

        /*
        Approach 2 : In this approach we can use a hashmap to store the count of every element in the hashmap
        to know the desired elements :

        // Time Complexity : O(n)
        // Space Complexity  : O(n)
         */

        // Here we are going to use approach 2 :

        // to maintain the order we are using here LinkedHashMap
        LinkedHashMap<Integer , Integer> hash = new LinkedHashMap<>();

        for(int i=0 ; i<n ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }

        for(int i:hash.keySet()){
            if(hash.get(i)>n/3){
                System.out.print(i+" ");
            }
        }

        // Time Complexity : O(N)
        // Space Complexity : O(N)

    }
}
