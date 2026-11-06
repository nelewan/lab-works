class Server extends Computer {
    int rackUnits;

    public Server(String model, int id, int ram, int rackUnits) {
        super(model, id, ram);
        this.rackUnits = rackUnits;
    }

    @Override
    public String toString() {
        return "Server {" + super.toString() + ", юнитов=" + rackUnits + "U}";
    }
}
