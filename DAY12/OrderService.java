package DAY12;
public class OrderService {
    public void placeOrder(Order order)
    {
        System.out.println(order.user.name);
        System.out.println(order.product.name);
        System.out.println(order.quantity);
        double totalPrice=order.product.price*order.quantity;
        System.out.println("Total Price: " + totalPrice);

    }
}
