public class Piano implements Playable, Portable {
    private String name;
    private int keys;
    private double weight;

    public Piano(String name, int keys, double weight) {
        this.name = name;
        this.keys = keys;
        this.weight = weight;
    }

    @Override
    public void play() {
        System.out.println("Пианино \"" + name + "\" (" + keys + " клавиши) играет мелодию: До-Ре-Ми!");
    }

    @Override
    public void tune() {
        System.out.println("Настройка пианино \"" + name + "\" мастером с помощью ключа... Настроено!");
    }

    @Override
    public void carry() {
        System.out.println("Пианино \"" + name + "\" очень тяжелое (" + weight + " кг)! Вызываем грузчиков.");
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}