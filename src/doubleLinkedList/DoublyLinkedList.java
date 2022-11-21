package doubleLinkedList;
public class DoublyLinkedList {
    public DNode head;
    public DNode tail;
    int length;
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public int length() {
        return length;
    }
    public void displayForward() {
        DNode tempDNode = head;
        while (tempDNode!=null) {
            System.out.print(tempDNode.data+" --> ");
            tempDNode = tempDNode.next;
        }
        System.out.print("null ");
        System.out.println();
    }
    public void displayBackward() {
        DNode tempDNode = tail;
        while (tempDNode!=null) {
            System.out.print(tempDNode.data+" --> ");
            tempDNode = tempDNode.previous;
        }
        System.out.print("null ");
        System.out.println();
    }
    public void insertStart(int value) {
        DNode newNode = new DNode(value);
        if (isEmpty()) {
            tail = newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    public void insertEnd(int value) {
        DNode newNode = new DNode(value);
        if (isEmpty()) {
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }
    public void insertGivenPosition(int position, int data) {
        DNode newNode = new DNode(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        }
        else {
            DNode previousNode = head;
            int count = 1; //position-1
            while (count<position-1) {
                previousNode = previousNode.next;
                count++; 
            }
            DNode current = previousNode.next; 
            previousNode.next = newNode;
            newNode.next = current;
            current.previous = newNode;
            newNode.previous = previousNode;
        }
    }
    public void deleteStart() {
        if (isEmpty()) {
          System.out.println("The list is empty, you can't delete");
        }
        else{
            DNode current = head;
            current = current.next;
            head = current;
            head.previous = null;
        }
        length--;
    }
    public void deleteEnd() {
        if (isEmpty()) {
            System.out.println("The list is empty, you can't delete");
        }
        else{
            //create current pointer which points to tail
            DNode current = tail; 
            //current pointer changes position previous node
            current = current.previous;
            //tail points current
            tail = current;
            //tail pointer next value should be null
            tail.next = null;
        }
        length--;
    }
    

}
