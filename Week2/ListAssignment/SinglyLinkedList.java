public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
        } else {
            Node runner = head;
            while (runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        }
    }

    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node find(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeAt(int n) {
        if (head == null || n < 0) {
            return;
        } else if (n == 0) {
            head = head.next;
        } else {
            Node prev = null;
            Node current = head;
            int count = 0;
            while (count < n && current != null) {
                prev = current;
                current = current.next;
                count++;
            }
            if (current != null) {
                prev.next = current.next;
            }
        }
    }
}

