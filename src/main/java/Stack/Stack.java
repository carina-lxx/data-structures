package Stack;

public class Stack {
    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.getData();
    }

    public void push(int num) {
        Node node = new Node(num);
        node.next = top;
        top = node;
    }

    public int remove() {
        int data = top.getData();

        if(top != null) {
            top = top.next;
        }
        return data;
    }


}
