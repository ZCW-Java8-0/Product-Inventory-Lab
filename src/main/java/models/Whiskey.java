package models;

public class Whiskey {
    private int id;
    private String name;
    private String brand;
    private double alcConcentration;
    private double size;
    private double price;
    private int qty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getAlcConcentration() {
        return alcConcentration;
    }

    public void setAlcConcentration(double alcConcentration) {
        this.alcConcentration = alcConcentration;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
