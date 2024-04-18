import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("mocha", 4.50);
        Item item2 = new Item("latte", 3.75);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("cappuccino", 4.25);

        // Order variables
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Add item1 to order2's item list and increment the order's total
        order2.addItem(item1);

        // Noah ordered a cappuccino
        order3.addItem(item4);

        // Sam added a latte
        order4.addItem(item2);

        // Cindhuri’s order is now ready
        order1.markReady();

        // Sam ordered more drinks - 2 lattes
        order4.addItem(item2);
        order4.addItem(item2);

        // Jimmy’s order is now ready
        order2.markReady();

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.println("Order 1 Details:");
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %.2f\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.println("\nOrder 2 Details:");
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %.2f\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.println("\nOrder 3 Details:");
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %.2f\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.println("\nOrder 4 Details:");
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %.2f\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}


