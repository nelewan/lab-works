abstract class Instrument {

    private String name;
    private String type;
    private double price;

    public Instrument(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public abstract void play();
    public abstract void tune();

    public void displayInfo() {
        System.out.printf("Инструмент: %-18s | Тип: %-10s | Цена: %,.2f руб.", name, type, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

