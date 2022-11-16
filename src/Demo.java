public class Demo {
    public static void main(String[] args) {
        SingList list = new SingList();
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
    }
}
