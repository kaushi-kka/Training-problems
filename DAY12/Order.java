package DAY12;

public class Order {
    User user;
    Product product;
    int quantity;
    public Order(User user,Product product,int quantity)
    {
        this.user=user;
        this.product=product;
        this.quantity=quantity;
    }
}
