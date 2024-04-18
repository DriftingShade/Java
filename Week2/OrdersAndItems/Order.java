import java.util.ArrayList;

public class Order {
    
    private String name;
    private boolean ready;
    private ArrayList<Item> items;
    
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }
    
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }
    
    // GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isReady() {
        return ready;
    }
    
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }
    
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}


