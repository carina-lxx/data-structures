

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    @DisplayName("Can initialize a linked list")
    public void canInitializeALinkedList() {
        new LinkedList();
    }

    @Test
    @DisplayName("can initialize a node with the next pointer")
    public void canInitializeNodeWithData() {
        Node node = new Node(5);
        int expected = 5;
        int actual = node.getData();
        assertEquals(expected, actual);
        assertNull(node.getNext());
    }

    @Test
    @DisplayName("Should return true as empty when initialize")
    public void isLinkedListEmptyWhenInitialized() {
        //SETUP
        LinkedList linkedList = new LinkedList();

        //EXECUTION
        boolean actual = linkedList.isEmpty();

        //ASSERT
        assertTrue(actual);
    }

    @Test
    @DisplayName("Should add new object to end of list")
    public void canAddToTheEnd() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(6);
        Node node2 = new Node(7);
        int expected = 7;
        //EXECUTION
        linkedList.add(node1);
        linkedList.add(node2);
        int actual = linkedList.getHead().getNext().getData();
        //ASSERT
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return the first element")
    public void ableToGetFirstObject() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(6);
        Node node2 = new Node(7);
        int expected = 6;

        //EXECUTION
        linkedList.add(node1);
        linkedList.add(node2);
        int actual = linkedList.getFirst().getData();

        // ASSERT
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return the last element")
    public void ableToGetLastObject() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(7);
        Node node2 = new Node(8);
        Node node3 = new Node(9);

        int expected = 9;

        //EXECUTION
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);

        int actual = linkedList.getLast().getData();

        // ASSERT
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return the Nth element or throws an exception")
    public void getTheNthElement() throws Exception {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(7);
        Node node2 = new Node(8);
        Node node3 = new Node(9);
        Node node4 = new Node(10);

        int expected = 8;

        //EXECUTION
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);

        int actual = linkedList.get(2).getData();

        // ASSERT
        assertEquals(expected, actual);
        assertThrows(Exception.class, () -> linkedList.get(6));
    }

    @Test
    @DisplayName("Should return index of object otherwise return -1")
    public void getTheObjectIndex() {
        //SETUP
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(7);
        Node node2 = new Node(8);
        Node node3 = new Node(9);
        Node node4 = new Node(10);

        int expected = 2;

        //EXECUTION
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);

        int actual = linkedList.contains(node3);

        // ASSERT
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should delete the object passed in")
    public void testDeleteObject() {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(7);
        Node node2 = new Node(8);
        Node node3 = new Node(9);
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.delete(node3);
        int expected = -1;
        int actual = linkedList.contains(node3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should delete the object by index")
    public void  testDeleteByIdx() {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(7);
        Node node2 = new Node(8);
        Node node3 = new Node(9);
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.deleteByIndex(3);
        int expected = -1;
        int actual = linkedList.contains(node3);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Throws IndexOutOfBounds exception if index greater than Linked list length")
    public void deleteByIndex_throwsIndexOutOfBoundsException_whenIndexGreaterThanLength() {
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(new Node(1));
        linkedlist.add(new Node(2));
        linkedlist.add(new Node(3));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            linkedlist.deleteByIndex(4);
        });
    }

}
