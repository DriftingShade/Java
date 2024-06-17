public class DLLTest {
    public static void main(String[] args) {

        DLL dll = new DLL();

        dll.insertAt(new Node(1), 0);
        dll.insertAt(new Node(2), 1);
        dll.insertAt(new Node(3), 2);
        dll.insertAt(new Node(4), 3);

        System.out.print("Forward: ");
        dll.printValuesForward();
        System.out.print("Backward: ");
        dll.printValuesBackward();


        dll.removeAt(2);


        System.out.print("Forward after removal: ");
        dll.printValuesForward();
        System.out.print("Backward after removal: ");
        dll.printValuesBackward();

        System.out.println("Is Palindrome? " + dll.isPalindrome()); // Should print false


        dll.insertAt(new Node(2), 1);
        dll.removeAt(3);
        dll.insertAt(new Node(1), 3);

        System.out.print("Forward after insertion: ");
        dll.printValuesForward();
        System.out.print("Backward after insertion: ");
        dll.printValuesBackward();

        System.out.println("Is Palindrome? " + dll.isPalindrome()); // Should print true
    }
}


