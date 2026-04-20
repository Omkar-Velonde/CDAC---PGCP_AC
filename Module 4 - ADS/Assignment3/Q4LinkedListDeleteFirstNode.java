package Assignment3;

public class Q4LinkedListDeleteFirstNode {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void deleteFirst() {
        if (head == null) return;
        head = head.next;
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
    	Q4LinkedListDeleteFirstNode list = new Q4LinkedListDeleteFirstNode();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.deleteFirst();

        System.out.print("LinkedList: ");
        list.display();
    }
}
