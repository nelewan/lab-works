package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Клищенков Дмитрий" );
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание:");
        System.out.println("1 - Телефон");
        System.out.println("2 - Ноутбуки");
        System.out.println("3 - Пользователи");

        System.out.print("Введите номер задания: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                Phone phone = new Phone("Samsung", "Galaxy S24", 3000.0);

                System.out.println("Телефон: " + phone.brand + " " + phone.model);
                System.out.println("Цена до скидки: " + phone.price + " руб.");

                phone.applyDiscount(15);
                System.out.println(phone);

                System.out.println("Цена после скидки 15%: "
                        + phone.price + " руб.");
                break;

            case 2:
                Laptop[] laptops = {
                        new Laptop("Lenovo", 8, 1800.0),
                        new Laptop("ASUS", 16, 2500.0),
                        new Laptop("HP", 32, 3100.0),
                        new Laptop("Acer", 16, 2200.0),
                        new Laptop("Apple", 8, 4500.0),
                        new Laptop("MSI", 64, 5000.0)
                };

                Laptop maxRamLaptop = laptops[0];
                Laptop mostExpensiveLaptop = laptops[0];

                for (Laptop laptop : laptops) {
                    if (laptop.ram > maxRamLaptop.ram) {
                        maxRamLaptop = laptop;
                    }

                    if (laptop.price > mostExpensiveLaptop.price) {
                        mostExpensiveLaptop = laptop;
                    }
                }

                System.out.println("Ноутбук с максимальным RAM:");
                System.out.println(maxRamLaptop.brand
                        + ", RAM: " + maxRamLaptop.ram + " ГБ"
                        + ", цена: " + maxRamLaptop.price + " руб.");

                System.out.println("Самый дорогой ноутбук:");
                System.out.println(mostExpensiveLaptop.brand
                        + ", RAM: " + mostExpensiveLaptop.ram + " ГБ"
                        + ", цена: " + mostExpensiveLaptop.price + " руб.");
                break;

            case 3:
                User[] users = {
                        new User("admin_ivan", Role.ADMIN),
                        new User("dima", Role.USER),
                        new User("guest1", Role.GUEST),
                        new User("admin_maria", Role.ADMIN),
                        new User("alex", Role.USER)
                };

                System.out.println("Администраторы:");

                for (User user : users) {
                    if (user.role == Role.ADMIN) {
                        System.out.println(user.username);
                    }
                }
                break;

            default:
                System.out.println("Неверный номер задания.");
        }

        scanner.close();
    }
}

