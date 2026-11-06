class Desktop extends Computer {
    String monitor;

    public Desktop(String model, int id, int ram, String monitor) {
        super(model, id, ram);
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Desktop {" + super.toString() + ", монитор=" + monitor + "}";
    }
}
