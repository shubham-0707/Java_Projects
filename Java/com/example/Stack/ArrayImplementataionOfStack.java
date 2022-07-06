package com.example.Stack;



// This is the program to implement stack using arrays....
class ArrayStack{
    public int top;
    public int size;

    public int[] st;

    ArrayStack(int length){
        st = new int[length];
        top = -1;
        size = 0;
    }

    public void push(int data){
        if(top==st.length-1){
            System.out.println("Stack OverFlow");
            return ;
        }
        top++;
        st[top]=data;
        size++;
    }

    public int pop(){
        if(st.length==0){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int res = st[top];
        top--;
        size--;
        return res;
    }

    public int peek(){
        if(size==0){
            System.out.println("No elements in Stack");
            return -1;
        }

        return st[top];
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
}

public class ArrayImplementataionOfStack {
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack(5);

        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.peek());

        while(s.getSize()!=0){
            System.out.println(s.pop());
        }

        System.out.println(s.isEmpty());
        System.out.println(s.peek());

    }

}
