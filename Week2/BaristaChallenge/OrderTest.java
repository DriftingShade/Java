public class OrderTest {
    public static void main(String[] args) {
        // Create 2 orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders with specified names
        Order order3 = new Order("John");
        Order order4 = new Order("Alice");
        Order order5 = new Order("Bob");

        // Add items to orders
        Item item1 = new Item("Drip Coffee", 2.50);
        Item item2 = new Item("Cappuccino", 4.50);
        Item item3 = new Item("Latte", 4.00);
        Item item4 = new Item("Espresso", 5.00);

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item2);
        order3.addItem(item3);

        order4.addItem(item1);
        order4.addItem(item4);

        order5.addItem(item2);
        order5.addItem(item3);
        order5.addItem(item4);

        // Set some orders as ready
        order1.setReady(true);
        order4.setReady(true);

        // Test getStatusMessage method
        System.out.println("Order 1 Status: " + order1.getStatusMessage());
        System.out.println("Order 2 Status: " + order2.getStatusMessage());
        System.out.println("Order 3 Status: " + order3.getStatusMessage());
        System.out.println("Order 4 Status: " + order4.getStatusMessage());
        System.out.println("Order 5 Status: " + order5.getStatusMessage());

        // Test getOrderTotal method
        System.out.println("Order 1 Total: $" + order1.getOrderTotal());
        System.out.println("Order 2 Total: $" + order2.getOrderTotal());
        System.out.println("Order 3 Total: $" + order3.getOrderTotal());
        System.out.println("Order 4 Total: $" + order4.getOrderTotal());
        System.out.println("Order 5 Total: $" + order5.getOrderTotal());

        // Display order information
        System.out.println("\nOrder 1:");
        order1.display();

        System.out.println("\nOrder 2:");
        order2.display();

        System.out.println("\nOrder 3:");
        order3.display();

        System.out.println("\nOrder 4:");
        order4.display();

        System.out.println("\nOrder 5:");
        order5.display();
    }
}

