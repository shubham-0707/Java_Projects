package Practice.Arrays;
import java.util.*;


public class array_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // taking input of boards...
        int[] boards = new int[n];
        for(int i=0 ; i<n ; i++){
            boards[i] = sc.nextInt();
        }


        int[] jersey = new int[n];
        for(int i=0 ; i<n ; i++){
            jersey[i] = i+1;
        }

        int mini = 0;
        boolean flag = false;
        while(true){
            int[] temp = new int[n];
            for(int i=0 ; i<n ; i++){
                temp[i] = jersey[i];
            }

            for(int i=0 ; i<n ; i++){
                jersey[boards[i]-1] = temp[i];
            }
            mini++;

            int count = 0;
            for(int i=0 ; i<n ; i++){
                if(jersey[i]==i+1){
                    count++;
                }
            }

            if(count==n){
                break;
            }

        }

        System.out.println("The answer is : "+mini);

        // Time Complexity : O(N^2)
        // Space Complexity : O(N)


    }
}
