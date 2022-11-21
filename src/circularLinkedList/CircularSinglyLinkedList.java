package circularLinkedList;

import singleLinkedList.Node;

public class CircularSinglyLinkedList{
    private Node lastNode;
    private int length;

    public CircularSinglyLinkedList(){
        this.length = 0;
        this.lastNode = null;
    }
    public int length() {
        return length;
    }
    public boolean isEmpty() {
        return length==0;
    }
    public void createCircularSinglyLinkedList() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;
        lastNode = fifth;
    }
    public void print() {
        if(lastNode == null){
            return;
        }
        Node first = lastNode.next;
        while(first != lastNode){
            System.out.print(first.data + " ");
            first = first.next; 
        }
        System.out.print(first.data + "");
    }
    public void insertEnd() {
        //TODO: write a program to insert node for the end of the circular singly linked list
    }
    public void insertStart() {
        //TODO: write a program to insert node for the beginning of the circular singly linked list
    }
    public void deleteEnd(){
        //TODO: write a program to delete node from the end of the circular singly linked list
    }
    public void deleteStart() {
        //TODO: write a program to delete node from the beginning of the circular singly linked list
    }
}

