package Practice.ArrayList;
import java.util.*;

// Program to implement ArrayList in java...
// It is also called as Dynamic Array..
// ArrayList doubles its size everytime it becomes full..
public class ArrayList_implementation {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        //Elements are added to the ArrayList by using a method "add()"..

        arr.add(2);
        arr.add(5);
        arr.add(8);
        arr.add(10);
        arr.add(15);

        //System.out.println(arr.stream().count(5)
        // The size of the arraylist is accessed by using the method "size()"...
        // The element at any particular index

        for(int i=0 ; i<arr.size() ; i++){
            System.out.println(arr.get(i) + " ");
        }
    }

    // The three main methods of an ArrayList are add() , get() , size() which are used frequently..
}
