
class Guitar extends Instrument {

    private int strings;


    public Guitar(String name, String sound, int strings) {
        super(name, "Струнный", sound);
        this.strings = strings;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("количество струн:" + strings);
    }

    @Override
    public void play() {
        System.out.println(getName() + " воспроизводит: Струнный звук (" + getSound() + ")");
    }


    public void tune() {
        System.out.println("-> Настройка струн для гитары \"" + getName() + "\" (" + strings + " струн)... Готово!");
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }
}