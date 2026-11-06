public class Main {
    public static void main(String[] args) {


        System.out.println("=== СОЗДАНИЕ И НАСТРОЙКА ИНСТРУМЕНТОВ ===\n");


        Instrument[] instruments = new Instrument[5];


        instruments[0] = new Guitar("Fender Stratocaster", 115000.0, 6);
        instruments[1] = new Guitar("Yamaha C40", 18500.0, 6);
        instruments[2] = new Piano("Беларусь B-110", 85000.0, 85);
        instruments[3] = new Piano("Yamaha U1", 620000.0, 88);
        instruments[4] = new Piano("Steinway & Sons D-274", 15400000.0, 88);


        for (int i = 0; i < instruments.length; i++) {
            System.out.println("--- Инструмент №" + (i + 1) + " ---");
            instruments[i].displayInfo();
            instruments[i].tune();
            instruments[i].play();
            System.out.println();
        }

        System.out.println("гитарка");
        Guitar soloGuitar = new Guitar("Gibson Les Paul", 210000.0, 6);
        soloGuitar.displayInfo();
        soloGuitar.play();
        soloGuitar.tune();

        System.out.println();

        System.out.println("пьяно");

        Piano coolPiano = new Piano("kavai k-300", 300000.0, 88);
        coolPiano.displayInfo();
        coolPiano.play();
        coolPiano.tune();
Instrument instrument = new Piano("kavai k-300", 300000.0, 88);

        System.out.println("название");








    }
}