package com.example.LinkedList;



// Program to implement a Linked List by scratch...
class LL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }


    public void addFirst(String data){
        Node newnode = new Node(data);



        newnode.next=head;
        head=newnode;

    }

    public void addLast(String data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newnode;
        newnode.next=null;
    }

    public void printList(){
        Node currNode = head;
        if(head==null){
            System.out.println("The list is empty");
            return;
        }

        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("The linkedList is already empty");
            return;
        }

        head = head.next;

    }

    public void deleteLast(){
        if(head==null){
            System.out.println("The linkedList is already empty");
            return;
        }

        Node secondLast = head;
        Node LastNode = head.next;
        while(LastNode.next!=null){
            secondLast=LastNode;
            LastNode = LastNode.next;
        }
        secondLast.next=null;

    }
}






public class LinkedList_implementation {



    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("Shubham");
        list.printList();

        list.addFirst("Shivam");
        list.printList();

        list.addLast("Singh");
        list.printList();

        list.addLast("Aman");
        list.printList();

        list.addFirst("Goldie");
        list.printList();

        list.addLast("Mummy");
        list.printList();

        list.addFirst("Daddy");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

    }
}
