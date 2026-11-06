public class Instrument {

    private String name;
    private String type;
    private String sound;


    public Instrument(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }


    public void play() {
        System.out.println(name + " издает звук: " + sound);
    }

    public void displayInfo() {
        System.out.println("Инструмент: " + name + " | Тип: " + type + " | Базовый звук: " + sound);
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

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}