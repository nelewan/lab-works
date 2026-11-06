class Piano extends Instrument {

    private int keys;

    public Piano(String name, String sound, int keys) {
        super(name, "Клавишный", sound);
        this.keys = keys;
    }

    @Override
    public void play() {
        System.out.println(getName() + " воспроизводит: Клавишный звук (" + getSound() + ")");
    }

    public void playChord() {
        System.out.println("-> Пианино \"" + getName() + "\" играет торжественный аккорд на " + keys + " клавишах!");
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }
}