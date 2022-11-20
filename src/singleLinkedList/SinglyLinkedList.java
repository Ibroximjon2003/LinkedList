package singleLinkedList;
public class SinglyLinkedList {

    public Node head;
    public void display () {
        Node current = head;
        while (current!=null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public int length() {
        int count = 0;
        Node current = head;
        if (head==null) {
            return 0;
        }
        while(current!=null){
          count++;
          current = current.next;
        }
        System.out.println(count);
        return count;
    }
    public void insertStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        
        Node current = head;
        while (current.next!=null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void insertGivenPosition(int position, int data) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        }
        else {
            Node previous = head;
            int count = 1; //position-1
            while (count<position-1) {
                previous = previous.next;
                count++; 
            }
            Node current = previous.next; 
            previous.next = newNode;
            newNode.next = current;
        }
    }

}
