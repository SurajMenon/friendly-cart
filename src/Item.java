public class Item {

    private String name;
    private int quantity;
    //TODO: add price

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //deliberately Not implmenting equals


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
