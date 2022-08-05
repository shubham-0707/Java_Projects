/*
In this question we have to find the pairs of the type like i<j and arr[i]>2*arr[j] in the array...

Example 1:

Input: N = 5, array[] = {1,3,2,3,1)

Output: 2

Explanation: The pairs are (3, 1) and (3, 1) as from both the pairs the condition arr[i] > 2*arr[j] is satisfied.

Example 2:

Input: N = 4, array[] = {3,2,1,4}

Output: 1

Explaination: There is only 1 pair  ( 3 , 1 ) that satisfy the condition arr[i] > 2*arr[j]

 */


package Striver_Sheet_Solutions_DayWise.Day_3;
import java.util.*;

public class reverse_pairs {
    public static int merge(int[] arr , int start , int mid , int end){
        int count = 0;
        int j=mid+1;

        for(int i=start ; i<=mid ; i++){
            while(j<=end && arr[i]>2*(long)arr[j]){
                j++;
            }
            count+=(j-(mid+1));
        }

        int low = start;
        int high = mid+1;

        ArrayList<Integer> ans = new ArrayList<>();
        while(low<=mid && high<=end){
            if(arr[low]<=arr[high]){
                ans.add(arr[low]);
                low++;
            }
            else{
                ans.add(arr[high]);
                high++;
            }
        }

        while(low<=mid){
            ans.add(arr[low]);
            low++;
        }
        while(high<=end){
            ans.add(arr[high]);
            high++;
        }

        for(int idx=start ; idx<=end ; idx++){
            arr[idx] = ans.get(idx-start);
        }

        return count;
    }

    public static int mergeSort(int[] arr , int start , int end){
        int count = 0;
        if(start<end){
            int mid = start + (end-start)/2;
            count+=mergeSort(arr , start , mid);
            count+=mergeSort(arr , mid+1, end);
            count+=merge(arr , start , mid , end);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //declaring and initialising the array...
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        /*
        Approach 1 : In approach 1 we can traverse in two loops and check the count of the pairs..

        // Time Complexity : O(n square)
        // Space Complexity : O(1)
         */

        /*
        Approach 2 : Use merge sort type solution to calculate the number of reverse pairs..

        // Time Complexity : O(n*logn)
        // Space Complexity : O(n)

        // Below I have used this very approach...
         */

        System.out.println("The number of reverse pairs in the array is : "+mergeSort(arr , 0 , arr.length-1));
    }
}
