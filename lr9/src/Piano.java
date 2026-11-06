class Piano extends Instrument {

    private int keys;

    public Piano(String name, double price, int keys) {
        super(name, "Клавишный", price);
        this.keys = keys;
    }

    @Override
    public void play() {
        System.out.println(getName() + " -> Издает клавишный звук");
    }

    @Override
    public void tune() {
        System.out.println(getName() + " -> Настраивается с помощью ключа");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Количество клавиш: " + keys);
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }
}
