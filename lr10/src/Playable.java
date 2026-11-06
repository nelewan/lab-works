public interface Playable {
    void play();
    void tune();

    static void showInfo() {
        System.out.println("[Справка] Интерфейс Playable определяет поведение музыкального инструмента.");
    }
}