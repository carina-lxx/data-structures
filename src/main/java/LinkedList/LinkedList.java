package LinkedList;

public class LinkedList {

    private Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public Node getHead() {
        return head;
    }

    public void add(Node node) {
        if(head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        if(head == null) return head;

        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    public Node get(int idx) throws Exception {
        Node cur = head;

        while(idx-- > 1) {
            if(cur.next == null) {
                throw new Exception("index is out of boundary");
            }
            cur = cur.next;
        }
        return cur;
    }

    public int contains(Node target) {
        int ans = 0;
        if(head == target) return ans;
        Node cur = head;
        while(cur.next != null) {
            if(cur == target) {
                return ans;
            }
            cur = cur.next;
            ans++;
        }
        return -1;
    }

    public void delete(Node target) {
        int idx = this.contains(target);
        if(idx == 0) {
            head = head.next;
        }
        if(idx > 0) {
            Node cur = this.head;
            while(idx > 1 && cur.next != null) {
                cur = cur.next;
                idx--;
            }
            cur.next = cur.next.next;
        }
    }
    public void deleteByIndex(int idx) {
        if(idx == 0) {
            head = head.next;
        }
        if(idx > 0) {
            Node cur = head;
            while(idx > 1 && cur.next != null) {
                cur = cur.next;
                idx--;
            }
            if(idx == 1) {
                cur.next = cur.next.next;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    }
}
