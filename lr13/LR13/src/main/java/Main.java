import java.util.*;

public class Main {
    public static void main(String[] args) {
        OrderSystem system = new OrderSystem();

        System.out.println("\n2. ДОБАВЛЕНИЕ КОРРЕКТНЫХ ЗАКАЗОВ В СИСТЕМУ");
        try {

            Order order10 = new Order(10, Arrays.asList("Монитор"));
            order10.setCustomerName("Алексей");
            order10.setTotalAmount(4500.0);
            system.addOrder(order10);

            Order order20 = new Order(-20, Arrays.asList("Чехол", "Кабель"));

            order20.setCustomerName("Ольга");
            order20.setTotalAmount(250.0);
            system.addOrder(order20);

        } catch (InvalidOrderDataException e) {
            System.out.println("Ошибка при создании заказа: " + e.getMessage());
        }



        System.out.println("\n=== 3. ОБРАБОТКА И ОТМЕНА ЗАКАЗОВ ===");
        try {
            system.processOrder(10);
            system.cancelOrder(20);
        } catch (OrderNotFoundException | OrderProcessingException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n4. ПРОВЕРКА ОШИБОК ОБРАБОТКИ (OrderProcessingException)");
        try {
            System.out.println("Пробуем отменить заказ №20 второй раз:");
            system.cancelOrder(20);
        } catch (OrderProcessingException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        } catch (OrderNotFoundException e) {
            System.out.println("Не найден: " + e.getMessage());
        }

        System.out.println("\n=== 5. ПРОВЕРКА ПОИСКА НЕСУЩЕСТВУЮЩЕГО ЗАКАЗА (OrderNotFoundException) ===");
        try {
            System.out.println("Ищем заказ #999:");
            system.processOrder(999);
        } catch (OrderNotFoundException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        } catch (OrderProcessingException e) {
            System.out.println("Ошибка обработки: " + e.getMessage());
        }
    }
}