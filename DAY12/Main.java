package DAY12;

public class Main {
    public static void main(String[] args)
        {
            User u=new User("John","Dubai");
            Product p=new Product("Laptop",1000.0);
            Order o=new Order(u,p,2);
            OrderService orderService=new OrderService();
            orderService.placeOrder(o);

        }
    
    
}
