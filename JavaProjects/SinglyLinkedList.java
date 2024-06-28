public class SinglyLinkedList {
    int size = 0;
    Node head = null;

    static class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    boolean isEmpty() {
        return size == 0;
    }

    int listSize() {
        return size;
    }

    Object get(int pos) throws IndexOutOfBoundsException {
        if (pos < 1 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        Node current = head;
        for (int i = 1; i < pos; i++) {
            current = current.next;
        }

        return current.data;
    }

    int position(Object element) {
        Node current = head;
        int pos = 1;
        while (current != null) {
            if (current.data.equals(element)) {
                return pos;
            }
            current = current.next;
            pos++;
        }
        return -1; // Return -1 if the element is not found
    }

    void insert(int pos, Object element) throws IllegalArgumentException {
        if (pos < 1 || pos > size + 1) {
            throw new IllegalArgumentException("Invalid position");
        }
        Node newNode = new Node(element);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else if (pos == size + 1) {
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        } else {
            Node current = head;
            for (int i = 1; i < pos - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    void delete(int pos) throws IllegalArgumentException {
        if (pos < 1 || pos > size) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (pos == 1) {
            head = head.next;
        } else if (pos == size) { // Delete from the end
            if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        } else {
            Node current = head;
            for (int i = 1; i < pos - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    /*
     * public static void main(String[] args) {
     * // Test the singly linked list
     * SinglyLinkedList list = new SinglyLinkedList();
     * try {
     * list.insert(1, 10);
     * list.insert(2, 20);
     * list.insert(3, 30);
     * list.display();
     * System.out.println("Element at position 2: " + list.get(2));
     * System.out.println("Position of element 20: " + list.position(20));
     * list.delete(2);
     * list.display();
     * list.insert(2, 40);
     * list.display();
     * list.delete(3);
     * list.display();
     * list.delete(1);
     * list.display();
     * } catch (Exception e) {
     * e.printStackTrace();
     * }
     * }
     */
}
