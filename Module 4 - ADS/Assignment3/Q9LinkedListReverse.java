package Assignment3;

public class Q9LinkedListReverse {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
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
        if (head == null) {
            System.out.print("(empty)");
            return;
        }

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
    	Q9LinkedListReverse list = new Q9LinkedListReverse();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.reverse();

        System.out.print("LinkedList: ");
        list.display();
        System.out.println();

        Q9LinkedListReverse emptyList = new Q9LinkedListReverse();

        emptyList.reverse();

        System.out.print("LinkedList: ");
        emptyList.display();
    }

}
