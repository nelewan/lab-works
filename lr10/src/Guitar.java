public class Guitar implements Playable, Portable {
    private String name;
    private int strings;
    private double weight;

    public Guitar(String name, int strings, double weight) {
        this.name = name;
        this.strings = strings;
        this.weight = weight;
    }

    @Override
    public void play() {
        System.out.println("Гитара \"" + name + "\" (" + strings + " струн) издает звонкий аккорд: Брям-брям!");
    }

    @Override
    public void tune() {
        System.out.println("Настройка гитары \"" + name + "\" с помощью электронного тюнера... Настроена!");
    }

    @Override
    public void carry() {
        System.out.println("Берем легкую гитару \"" + name + "\" в чехол за спину.");
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}