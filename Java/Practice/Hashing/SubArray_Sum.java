package Practice.Hashing;
import java.util.*;


// This program is made to find the lower index and the upper index of the sub-array containing the required sum....
public class SubArray_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the sum required : ");
        int sum = sc.nextInt();
        HashMap<Integer , Integer> hash = new HashMap<>();
        int currSum = 0;
        int start = 0;
        int end = -1;

        for(int i=0 ; i<arr.length ; i++){
            currSum+=arr[i];
            if((currSum-sum)==0){
                start=0;
                end=i;
                break;
            }
            if(hash.containsKey((currSum-sum))){
                start=hash.get((currSum-sum))+1;
                end = i;
                break;
            }
            hash.put(currSum , i);
        }
        if(end==-1) System.out.println("required sum sub-array not found");
        else{
            System.out.println("Required sum aub-array found !");
            System.out.println("Start : "+start);
            System.out.println("End : "+end);
        }
    }

}
