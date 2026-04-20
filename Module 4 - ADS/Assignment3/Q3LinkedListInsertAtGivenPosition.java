package Assignment3;

public class Q3LinkedListInsertAtGivenPosition {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insertAtPosition(int value, int position) {
        Node newNode = new Node(value);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return;

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" → ");
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
    	Q3LinkedListInsertAtGivenPosition list = new Q3LinkedListInsertAtGivenPosition();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.insertAtPosition(25, 2);

        System.out.print("LinkedList: ");
        list.display();
    }
}
