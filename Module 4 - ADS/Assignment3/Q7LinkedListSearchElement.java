package Assignment3;

public class Q7LinkedListSearchElement {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    int search(int value) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == value) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
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

    public static void main(String[] args) {
    	Q7LinkedListSearchElement list = new Q7LinkedListSearchElement();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        int index = list.search(30);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
