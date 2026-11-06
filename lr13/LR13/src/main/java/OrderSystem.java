import java.util.HashMap;
import java.util.Map;

class OrderSystem {

    private Map<Integer, Order> orders = new HashMap<>();

    public void addOrder(Order order) {
        orders.put(order.getOrderId(), order);
        System.out.println("В систему добавлен: " + order);
    }

    public Order findOrder(int id) throws OrderNotFoundException {
        if (!orders.containsKey(id)) {
            throw new OrderNotFoundException("Заказ с ID " + id + " не найден в базе!");
        }
        return orders.get(id);
    }

    public void processOrder(int id) throws OrderNotFoundException, OrderProcessingException {
        Order order = findOrder(id);
        order.processOrder();
    }

    public void cancelOrder(int id) throws OrderNotFoundException, OrderProcessingException {
        Order order = findOrder(id);
        order.cancelOrder();
    }
}