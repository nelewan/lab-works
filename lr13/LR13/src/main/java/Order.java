import java.util.List;
import java.util.ArrayList;

class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;
    private String status;
    private List<String> items;

    public Order(int orderId, List<String> items) throws InvalidOrderDataException {
        setOrderId(orderId);

        this.items = items != null ? items : new ArrayList<>();
        this.status = "NEW";
        this.customerName = ""; // Значение по умолчанию
        this.totalAmount = 0.0; // Значение по умолчанию
    }


    public void setOrderId(int orderId) throws InvalidOrderDataException {
        if (orderId <= 0) {
            throw new InvalidOrderDataException("Ошибка: ID заказа должен быть положительным. Передано: " + orderId);
        }
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName) throws InvalidOrderDataException {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new InvalidOrderDataException("Ошибка: имя клиента не может быть пустым!");
        }
        this.customerName = customerName;
    }

    public void setTotalAmount(double totalAmount) throws InvalidOrderDataException {
        if (totalAmount <= 0) {
            throw new InvalidOrderDataException("Ошибка: сумма заказа должна быть > 0. Передано: " + totalAmount);
        }
        this.totalAmount = totalAmount;
    }


    public void processOrder() throws OrderProcessingException {
        if ("CANCELLED".equals(status)) {
            throw new OrderProcessingException("Нельзя обработать отмененный заказ #" + orderId);
        }
        if ("PROCESSED".equals(status)) {
            throw new OrderProcessingException("Заказ #" + orderId + " уже был обработан ранее!");
        }
        this.status = "PROCESSED";
        System.out.println("Заказ #" + orderId + " успешно обработан.");
    }

    public void cancelOrder() throws OrderProcessingException {
        if ("CANCELLED".equals(status)) {
            throw new OrderProcessingException("Заказ #" + orderId + " уже отменен!");
        }
        this.status = "CANCELLED";
        System.out.println("Заказ #" + orderId + " успешно отменен.");
    }


    public int getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public double getTotalAmount() { return totalAmount; }
    public String getStatus() { return status; }
    public List<String> getItems() { return items; }

    @Override
    public String toString() {
        return "Заказ #" + orderId + " [" + customerName + ", " + totalAmount + " руб., статус: " + status + "]";
    }
}