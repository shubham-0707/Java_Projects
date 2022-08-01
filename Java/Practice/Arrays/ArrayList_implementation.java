package Practice.Arrays;
import java.util.ArrayList;


// Program to find the largest number of consecutive 1's in the array...
public class ArrayList_implementation {
    public static void main(String[] args) {
        int count=0;
        int[] nums = {1,1,0,1,1,1};

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==1){
                count++;
                System.out.println(count + " ");
            }
            else{
                arr.add(count);
                count=0;
            }
        }
        arr.add(count);

        int maxi = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.size() ; i++){
            maxi = Math.max(maxi , arr.get(i));
        }
        System.out.println("Maximum is : "+maxi);
    }
}
