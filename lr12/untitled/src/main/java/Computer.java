class Computer {
    String model;
    int id;
    int ram;

    public Computer(String model, int id, int ram) {
        this.model = model;
        this.id = id;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "id=" + id + ", ram=" + ram + "GB";
    }
}
