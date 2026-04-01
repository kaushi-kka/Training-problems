package DAY11;

class OutOfStockException extends Exception
{
    public OutOfStockException(String message)
    {
        super(message);
    }
}
class paymentFailedException extends Exception
{
    public paymentFailedException(String message)
    {
        super(message);
    }
}
class OrderProcessingException extends Exception
{
    public OrderProcessingException(String message)
    {
        super(message);
    }
}
class Product
{
    String name;
    int stock;
    double price;
    Product(String name,int stock,double price)
    {
        this.name=name;
        this.stock=stock;
        this.price=price;
    }
}
class User
{
    String name;
    String address;
    User(String name,String address)
    {
        this.name=name;
        this.address=name;
    }
}
class Order
{
    String product;
    String user;
    int quantity;
    Order(String product,String user,int quantity)
    {
        this.product=product;
        this.user=user;
        this.quantity=quantity;
    }
}
class OrderService
{
    static void placeOrder(Order O) throws OutOfStockException, paymentFailedException, OrderProcessingException
    {
        if(O.product.stock<=0)
        {
            throw new OutOfStockException("Product is out of stock");
        }
        if(Math.random()<0.5)
        {
            throw new paymentFailedException("Payment failed");
        }
        if(Math.random()<0.2)
         {
             throw new OrderProcessingException("Error processing order");
         }
    }
}
public class EcommerceOrder 
{
    public static void main(String[] args)
    {
        Product p=new Product("mouse",5,200.0);
        User u=new User("Kaushi","Chennai");
        Order o=new Order("mouse","Kaushi",3);
        OrderService s=new OrderService();
        try {
            s.placeOrder(o);
        } 
        catch (OutOfStockException e) 
        {
            System.out.print(e.getMessage());
        }
    }
}
