package Package1;

public class Customer extends Person {

    public Customer(String name, String phone) {
        super(name, phone);
    }

    @Override
    public void display() {
        System.out.println("Customer: " + name + ", Phone: " + phone);
    }
}