public class Main {
    public static void main(String[] args) {

        Instrument[] orchestra = new Instrument[5];


        orchestra[0] = new Guitar("Fender Stratocaster", "Драйв", 6);
        orchestra[1] = new Guitar("Gibson Les Paul", "Рок-соло", 6);
        orchestra[2] = new Guitar("Yamaha Bass", "Глубокий бас", 4);
        orchestra[3] = new Piano("Steinway & Sons", "Классическое эхо", 88);
        orchestra[4] = new Piano("Roland Digital", "Электронный свип", 76);

        System.out.println("=== ДЕМОНСТРАЦИЯ РАБОТЫ ИНСТРУМЕНТОВ ===\n");

        for (int i = 0; i < orchestra.length; i++) {
            System.out.println("[" + (i + 1) + "]");
            orchestra[i].displayInfo();
            orchestra[i].play();

            if (orchestra[i] instanceof Guitar) {
                Guitar g = (Guitar) orchestra[i];
                g.tune();
            } else if (orchestra[i] instanceof Piano) {
                Piano p = (Piano) orchestra[i];
                p.playChord(); //
            }

            System.out.println();
        }
    }
}