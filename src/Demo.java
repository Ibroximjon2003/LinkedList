import circularLinkedList.CircularSinglyLinkedList;
// import doubleLinkedList.DoublyLinkedList;
// import singleLinkedList.Node;
// import singleLinkedList.SinglyLinkedList;
// import singleLinkedList.Node;

public class Demo {
    public static void main(String[] args) {
        /*
        SinglyLinkedList list = new SinglyLinkedList();
        list.head = new Node(10);
        Node node2 = new Node(11);
        Node node3 = new Node(12);
        Node node4 = new Node(13);
        list.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        list.display();
        list.insertStart(9);
        list.display();
        list.insertEnd(14);
        list.display();
        list.insertGivenPosition(2, 100);
        list.display();
        list.length();
        System.out.println("hello world");
         */

        // DoublyLinkedList dLinkedList = new DoublyLinkedList();
        // dLinkedList.insertStart(10);
        // dLinkedList.insertStart(9);
        // dLinkedList.insertEnd(11);
        // dLinkedList.insertGivenPosition(2, 100);
        // dLinkedList.insertEnd(1);
        // dLinkedList.insertEnd(2);
        // dLinkedList.insertEnd(3);
        // dLinkedList.insertEnd(4);
        // dLinkedList.deleteStart();
        //dLinkedList.deleteEnd();
        // dLinkedList.displayForward();
        // dLinkedList.displayBackward();
    
        CircularSinglyLinkedList cirSingLinList = new CircularSinglyLinkedList();
        cirSingLinList.createCircularSinglyLinkedList();
        cirSingLinList.print();

        
    }
}
