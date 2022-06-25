package com.example.LinkedList.Single_Linked_List;
// This is the simple implementation of the linkedList in the Java language...
// Kindly look at the code once you need to revise the topics of the single linkedlist...
class SLL{

   Node head;

    class Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
            this.next=null;
        }

        Node(int data , Node next){
            this.data=data;
            this.next=next;
        }
    }

    public void addFirst(int data){
        if(head!=null){
            Node newnode = new Node(data);
            newnode.next=head;
            head=newnode;
            return;
        }
        Node newnode = new Node(data);
        newnode.next=null;
        head=newnode;
        return;
    }

    public void addLast(int data){
        Node newnode = head;
        if(head!=null){
            while(newnode.next!=null){
                newnode=newnode.next;
            }
            Node addNode = new Node(data);
            newnode.next=addNode;
            addNode.next=null;
            return;
        }

        Node addNode = new Node(data);
        addNode.next = null;
        head=addNode;
        return;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertInBetween(int data , int prevdata){
        if(head!=null){
            Node newnode = new Node(data);
            Node temp = head;
            while(true){
                if(temp.data==prevdata){
                    newnode.next=temp.next;
                    temp.next=newnode;
                    return;
                }
                temp=temp.next;
            }
        }
        System.out.println("The LinkedList has no element...");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("The linked list is already empty...");
        }
        else{
            head=head.next;
            System.out.println("Node deleted...");
        }
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("The list is already empty...");
        }
        else if(head.next==null){
            head=null;
            System.out.println("Node deleted..");
        }
        else{
            Node temp1 = null;
            Node temp2 = head;
            while(temp2.next!=null){
                temp1 = temp2;
                temp2=temp2.next;
            }
            temp1.next = null;
            System.out.println("Node deleted...");
        }
    }


}

public class Single_Linked_List {
    public static void main(String[] args) {
        SLL single = new SLL();
        single.addFirst(10);
        single.addFirst(20);
        single.insertInBetween(23 , 10);
        single.display();
        single.addLast(50);
        single.display();
        single.deleteFirst();
        single.display();
        single.deleteFirst();
        single.display();
        single.deleteLast();
        single.display();

    }
}
