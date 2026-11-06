class Guitar extends Instrument {

    private int strings;

    public Guitar(String name, double price, int strings) {
        super(name, "Струнный", price);
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println(getName() + " -> Издает струнный звук");
    }

    @Override
    public void tune() {
        System.out.println(getName() + " -> Настраивается с помощью тюнера");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // вызов базовой информации
        System.out.println(" | Количество струн: " + strings);
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }
}