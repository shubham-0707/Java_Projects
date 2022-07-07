package com.example.Queue;
import java.util.*;


// This is the program to implement queue using array....
// All the necessary functions of queues are made here....

class ArrayQueue{
    private int front;
    private int rear;
    private int[] arr;

    ArrayQueue(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return front==-1 && rear==-1;
    }

    public boolean isFull(){
        return rear == arr.length-1;
    }

    public void add(int ele){
        if(rear==arr.length-1){
            System.out.println("Queue is already full");
            return;
        }
        rear++;
        arr[rear] = ele;
        if(front==-1){
            front = 0;
        }
    }

    public int remove(){
        if(rear==-1 && front==-1){
            System.out.println("Queue is Empty");
            return -1;
        }
        int res = arr[front];
        if(front==rear){
            front=rear=-1;
            return res;
        }

        for(int i = front ; i<rear ; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return res;
    }

    public int peek(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[rear];
    }

    public int  size(){
        if(front == -1 && rear==-1){
            return 0;
        }

        return rear-front+1;
    }

}

public class Array_Implementation {
    public static void main(String[] args) {

        ArrayQueue q = new ArrayQueue(5);

        q.add(2);
        q.add(5);
        q.add(7);
        q.add(10);
        q.add(15);

        System.out.println(q.remove());
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());

        q.add(20);
        System.out.println(q.remove());

        q.add(100);

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
