package Practice.Arrays;
import java.util.*;

public class multi_array_check {
    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        int[] arr2 = new int[2];
        arr2[0] = 1;
        arr2[1] = 2;

        arr[0] = arr2;
        arr[1] = arr2;
        arr[3] = arr2;

        for(int i=0 ; i<4 ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
