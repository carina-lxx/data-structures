package LinkedList;

public class Node {
    Node next;
    private int data;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
