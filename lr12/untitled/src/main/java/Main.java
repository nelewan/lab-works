import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {


    public static void printUniversities(List<University> list, int rank) {
        System.out.println("Список университетов с рангом " + rank + ":");
        for (University u : list) {
            if (u.getRank() == rank) {
                System.out.println(u.name + " (" + u.country + ")");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("ЗАДАНИЕ 1: КОМПЬЮТЕРЫ (MAP)\n");

        Map<String, Computer> map = new HashMap<>();

        map.put("MacBook", new Laptop("MacBook", 1, 16, 14.2));
        map.put("Asus TUF", new Laptop("Asus TUF", 2, 16, 15.6));
        map.put("Lenovo", new Laptop("Lenovo", 3, 8, 15.6));

        map.put("HP Pavilion", new Desktop("HP Pavilion", 4, 16, "Samsung 24"));
        map.put("Dell XPS", new Desktop("Dell XPS", 5, 32, "LG 27"));
        map.put("HyperPC", new Desktop("HyperPC", 6, 64, "AOC 32"));

        map.put("Dell R740", new Server("Dell R740", 7, 128, 2));
        map.put("HP ProLiant", new Server("HP ProLiant", 8, 256, 4));

        for (String key : map.keySet()) {
            System.out.println("Модель: " + key + " -> " + map.get(key));
        }


     System.out.println("\n\n ЗАДАНИЕ 2: УНИВЕРСИТЕТЫ\n");

        List<University> universities = new ArrayList<>();
        universities.add(new University(1, "БГУ", "Беларусь", 5, Arrays.asList(4, 5, 5, 4)));
        universities.add(new University(2, "БГУИР", "Беларусь", 5, Arrays.asList(4, 4, 5, 4)));
        universities.add(new University(3, "Oxford", "UK", 1, Arrays.asList(5, 5, 5, 5)));
        universities.add(new University(4, "Колледж связи", "Беларусь", 8, Arrays.asList(2, 3, 2, 3)));
        universities.add(new University(5, "ГрГУ", "Беларусь", 6, Arrays.asList(4, 4, 5, 4)));

        System.out.println("1. Университеты с рейтингом < 3:");
        for (University u : universities) {
            if (u.getAverageRating() < 3.0) {
                System.out.println(u.name + " (средний балл: " + u.getAverageRating() + ")");
            }
        }

        System.out.println("\n2. Повышаем ранг тем, у кого средний балл >= 4:");
        for (University u : universities) {
            if (u.getAverageRating() >= 4.0) {
                u.setRank(u.getRank() + 1);
                System.out.println(u.name + " -> новый ранг: " + u.getRank());
            }
        }

        System.out.println();
        printUniversities(universities, 6);

        universities.sort((u1, u2) -> {
            if (u1.getAverageRating() != u2.getAverageRating()) {
                return Double.compare(u2.getAverageRating(), u1.getAverageRating());
            }
            return u1.name.compareTo(u2.name);
        });

        System.out.println("\n4. Отсортированный список (убывание балла / алфавит):");
        for (University u : universities) {
            System.out.println("ID: " + u.id + " | " + u.name + " | Средний рейтинг: " + u.getAverageRating());
        }
    }
}