package com.example.Queue;

// this program is  made to implement queue using linked list.....
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


class LLQueue {
    private Node head;
    private Node tail;
    int size;

    LLQueue() {
        head = null;
        tail = null;
        size = 0;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    private void addLast(int ele) {
        Node newnode = new Node(ele);
        if (isEmpty()) {
            head=tail=newnode;
            return;
        }

        tail.next = newnode;
        tail=newnode;


    }

    public void add(int ele) {
        addLast(ele);
        size++;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return null;
        }

        return head.data;
    }

    public Integer remove() {
        if (isEmpty()) {
            System.out.println("The Queue is already empty");
            return null;
        }

        int res = head.data;

        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return res;
    }

    public int size(){
        return size;
    }

}

public class LinkedList_implementation{
    public static void main(String[] args) {
        LLQueue q = new LLQueue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);

        while(!q.isEmpty()){
            System.out.println(q.remove()+" ");
        }

        q.add(30);
        q.add(78);
        System.out.println(q.isEmpty());

        System.out.println("peek : "+q.peek());
        System.out.println("Size : "+q.size());
        q.add(98);
        q.add(100);
        System.out.println(q.size());
    }
}
