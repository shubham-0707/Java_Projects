package Big_Oh_Assignment;
import java.util.*;

public class number_of_NGEs_to_the_right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

         HashMap<Integer , Integer> hash = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        for(int i=arr.length-1 ; i>=0 ; i--){
            if(st.isEmpty()){
                ans.push(-1);
            }
            else{
                while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.push(-1);
                }
                else{
                    ans.push(st.peek());
                }
            }
            st.push(i);
        }

        for(int i=0 ; i<arr.length ; i++){
            int x = ans.pop();
            if(x==-1){
                hash.put(arr[i] , arr.length);
            }
            else{
                hash.put(arr[i] , x);
            }
        }

        int[] ans_arr = new int[arr.length];
        for(int i=0 ; i<ans_arr.length ; i++){
            int count= 0;
            for(int j = hash.get(arr[i]);j<arr.length ; j++){
                if(arr[j]>arr[i]) count++;
            }
            ans_arr[i] = count;
        }

        // Printing the answer_array...

        for(int i=0 ; i<ans_arr.length ; i++){
            System.out.print(ans_arr[i]+" ");
        }


    }
}
