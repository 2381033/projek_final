package AplikasiTokoFurniture.entities;


public class BarangFurniture {
    private int id;
    private String name;
    private int price;
    private String description;

    public BarangFurniture(int id, String name, int price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return id + ". " + name + " - Rp" + price + " (" + description + ")";
    }
}
