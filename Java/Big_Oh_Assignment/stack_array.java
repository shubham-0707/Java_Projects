package Big_Oh_Assignment;

public class stack_array {
    static int top  = -1;
     static int[] stack = new int[100];


    public static void push(int val){
        top++;
        stack[top] = val;
    }

    public static int pop(){
        if(top==-1){
            System.out.println("The stack is already empty");
            return -1;
        }
        int temp  = stack[top];
        top--;
        System.out.println(temp);
        return temp;
    }

    public static int peek(){
        if(top==-1){
            System.out.println("The stack is already empty");
            return -1;
        }
        System.out.println(stack[top]);
        return 0;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        pop();
        pop();
        pop();
        pop();
        push(89);
        peek();
        pop();
        peek();
    }
}
