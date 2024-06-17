public class DLL {
    public Node head;
    public Node tail;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    public void printValuesForward() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printValuesBackward() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.value + " ");
            current = current.previous;
        }
        System.out.println();
    }

    public Node pop() {
        if (tail == null) {
            return null;
        }
        Node poppedNode = tail;
        if (tail.previous != null) {
            tail.previous.next = null;
            tail = tail.previous;
        } else {
            head = null;
            tail = null;
        }
        return poppedNode;
    }

    public boolean contains(Integer value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertAt(Node newNode, int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            newNode.next = head;
            if (head != null) {
                head.previous = newNode;
            } else {
                tail = newNode;
            }
            head = newNode;
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = current.next;
        newNode.previous = current;
        if (current.next != null) {
            current.next.previous = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            if (head != null) {
                head = head.next;
                if (head == null) {
                    tail = null;
                } else {
                    head.previous = null;
                }
            }
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }
        if (current.next != null) {
            current.next.previous = current.previous;
        } else {
            tail = current.previous;
        }
        current.previous.next = current.next;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node forward = head;
        Node backward = tail;
        while (forward != backward && forward != null && backward != null) {
            if (forward.value != backward.value) {
                return false;
            }
            forward = forward.next;
            backward = backward.previous;
        }
        return true;
    }
}
