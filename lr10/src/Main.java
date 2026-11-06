public class Main {
    public static void main(String[] args) {
        Playable.showInfo();
        System.out.println();

        Playable[] orchestra = new Playable[5];

        // 3 гитары и 2 пианино
        orchestra[0] = new Guitar("Fender Stratocaster", 6, 3.5);
        orchestra[1] = new Guitar("Gibson Les Paul", 6, 4.1);
        orchestra[2] = new Guitar("Yamaha Bass", 4, 4.3);
        orchestra[3] = new Piano("Steinway & Sons", 88, 300.0);
        orchestra[4] = new Piano("Yamaha Digital", 76, 55.0);

        System.out.println("настроили и играем\n");

        for (int i = 0; i < orchestra.length; i++) {
            System.out.println(" Инструмент №" + (i + 1));
            orchestra[i].tune();
            orchestra[i].play();

            if (orchestra[i] instanceof Portable) {
                Portable p = (Portable) orchestra[i];
                p.carry();
                System.out.printf("Вес инструмента: %.1f кг%n", p.getWeight());
            }
            System.out.println();
        }
    }
}