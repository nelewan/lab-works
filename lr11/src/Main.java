public class Main {
    public static void main(String[] args) {

        Sport basicSport = new Sport("Общий спорт", 2, 45);
        Football football = new Football("Футбол", 90, "Лига Чемпионов");
        Tennis tennis = new Tennis("Большой теннис", 2, 120, "Грунт");

        System.out.println(" ПЕРЕГРУЗКИ ");

        System.out.println("\n-- Вызовы метода play() у базового класса Sport --");
        basicSport.play();
        basicSport.play("Сборная");
        basicSport.play(6);

        System.out.println("\n-- Вызовы унаследованных и собственных перегрузок у потомков --");
        football.play();
        football.play("Реал Мадрид");
        football.play("Реал Мадрид", 3);

        tennis.play();
        tennis.play(2);
        tennis.play("Рафаэль Надаль", true);

        System.out.println("\n\nПЕРЕОПРЕДЕЛЕНИЯ");

        Sport[] sports = { basicSport, football, tennis };

        for (Sport s : sports) {
                System.out.println("Вид спорта: " + s.getName() + " | Правила: " + s.getRules());
        }

        System.out.println("\n\nСРАВНЕНИЕ ВИДОВ ПОЛИМОРФИЗМА");
        System.out.println("1. Статический (Перегрузка / play):");
        System.out.println("   - Реализуется внутри одного класса или при наследовании.");
        System.out.println("   - Имя одинаковое, сигнатура параметров РАЗНАЯ.");
        System.out.println("   - Связывание происходит на этапе КОМПИЛЯЦИИ.");

        System.out.println("\n2. Динамический (Переопределение / getRules):");
        System.out.println("   - Реализуется в иерархии классов (родитель -> потомок).");
        System.out.println("   - Имя и параметры ПОЛНОСТЬЮ СОВПАДАЮТ.");
        System.out.println("   - Связывание происходит во время ВЫПОЛНЕНИЯ (Runtime).");
    }
}