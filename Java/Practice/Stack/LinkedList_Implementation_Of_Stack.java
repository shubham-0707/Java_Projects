package Practice.Stack;

//  Program to implement stack using Linked List...


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LLStack{

    public int size;
    public Node head;


    LLStack(){
        head = null;
        size = 0;
    }

    public void push(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
    }


    public int pop(){
        if(head==null){
            System.out.println("Stack Underflow");
            return -1;
        }

        int res = head.data;
        head=head.next;
        size--;
        return res;
    }


    public int peek(){
        if(head==null){
            System.out.println("Stack is Empty");
            return -1;
        }

        return head.data;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

}

public class LinkedList_Implementation_Of_Stack {
    public static void main(String[] args) {
        LLStack s = new LLStack();

        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);

        System.out.println(s.pop());

        System.out.println(s.getSize());

        System.out.println(s.peek());

        System.out.println(s.pop());

        System.out.println(s.getSize());

        s.push(30);
        s.push(40);

        while(s.getSize()!=0){
            System.out.println(s.pop());
        }
    }
}
