package Queue;

public class Queue {

    private Node head;
    private Node tail;
    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        return head.getData();
    }

    public void add(int num) {
        Node node = new Node(num);
        if(tail != null) {
            tail.next = node;
        }
        tail = node;
        if(head == null) {
            head = node;
        }
    }

    public int remove() {
        int data = head.getData();
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return data;
    }
}
