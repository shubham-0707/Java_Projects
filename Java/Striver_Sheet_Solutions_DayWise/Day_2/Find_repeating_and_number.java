
/*
There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.

        This is one of those problems.

        Please take extra care to make sure that you are type-casting your ints to long properly and at all places. Try to verify if your solution works if number of elements is as large as 105

        Food for thought :

        Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly so that the numbers do not overflow.
        For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n), factorial(k) and then divide them.
        Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
        Obviously approach 1 is more susceptible to overflows.
        You are given a read only array of n integers from 1 to n.

        Each integer appears exactly once except A which appears twice and B which is missing.

        Return A and B.

        Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

        Note that in your output A should precede B.

        Example:

        Input:[3 1 2 5 3]

        Output:[3, 4]

        A = 3, B = 4

*/

package Striver_Sheet_Solutions_DayWise.Day_2;
import java.util.*;

public class Find_repeating_and_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        /*
        // Approach 1 : using nested loops and assigning the values to the result array:

        int[] ans = new int[2];

        // checking the repeated values...
        for(int i=0 ; i<n ; i++){
            int count = 1;
            for(int j=0 ; j!=i && j<n ; j++){
                if(arr[i]==arr[j]){
                    ans[0] = arr[j];
                }
            }
        }

        for(int i=1 ; i<=n ; i++){
            boolean flag = false;
            for(int j=0 ; j<n ; j++){
                if(arr[j] == i){
                    flag = true;
                    break;
                }
            }

            if(flag == false){
                ans[1] = i;
            }
        }

        // printing the result array:
        System.out.print(ans[0]+" "+ans[1]);

        // Time Complexity : O(n^2)
        // Space Complexity : O(1)

         */

        // Approach 2 : Using HashMaps...
        HashMap<Integer , Integer> hash = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            hash.put(arr[i] , hash.getOrDefault(arr[i] , 0)+1);
        }
        int[] ans = new int[2];
        for(int i=1 ; i<=n ; i++){
            if(hash.get(i)!=null && hash.get(i)==2){
                ans[0] = i;
            }

            if(!hash.containsKey(i)){
                ans[1] = i;
            }
        }

        System.out.println(ans[0]+" "+ans[1]);

        // Time Complexity : O(n)
        // Space Complexity : O(n)

    }
}
