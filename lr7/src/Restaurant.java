public class Restaurant {

    private String name;
    private String cuisine;
    private double rating;

    private static int totalRestaurants = 0;
    private static double totalRating = 0.0;

    public Restaurant(String name, String cuisine, double rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;


        totalRestaurants++;
        totalRating += rating;
    }

    public static double getAverageRating() {
        if (totalRestaurants == 0) {
            return 0.0;
        }
        return totalRating / totalRestaurants;
    }

    public void printInfo() {
        System.out.printf("Ресторан: %-15s | Кухня: %-12s | Рейтинг: %.1f%n", name, cuisine, rating);
    }

    public static void test() {

        Restaurant r1 = new Restaurant("Mario Pizza", "Итальянская", 4.8);

        System.out.println("Имя: " + r1.name);
        System.out.println("Кухня: " + r1.cuisine);
        System.out.println("Рейтинг: " + r1.rating);

        System.out.println("Всего ресторанов: " + totalRestaurants);
        System.out.println("Суммарный рейтинг: " + totalRating);
    }

   public static void main() {
    test();

    }
}