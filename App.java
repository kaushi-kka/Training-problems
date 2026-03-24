class User
{
    String name;
    String phone;
    String address;
    String role="User";
    User()
    {
        System.out.println("Hello User");
    }
    User(String name)
    {
        this.name=name;
        //System.out.println("User created");
    }
    void display()
    {
        System.out.println("Name:"+name);
        // System.out.println("Phone:"+phone);
        // System.out.println("Address:"+address);
        //System.out.println("Role:"+role);
    }
}
class Driver extends User
{
    String role="Driver";
    String vehicle;
    Driver(String name,String vehicle)
    {
        super(name);
        this.vehicle=vehicle;
        // System.out.println("Name:"+name);
        // System.out.println("Role:"+role);
    }
    void displayDriver()
    {
        super.display();
        System.out.println("vehicle:"+vehicle);
        System.out.println("Driver class role:"+role);
        System.out.println("User class role:"+super.role);
        System.out.println("-------------------------------------");
    }
}
class FoodUser extends User
{
    String favouriteFood;
    FoodUser()
    {
        System.out.println("FoodUser created");
    }
}
class TravelUser extends User{
    String preferredVehicle;
}
public class App
{
    public static void main(String[] args)
    {
        Driver D=new Driver("Kaushi","Swift");
        Driver D1=new Driver("Nishan","Brezza");
        Driver D2=new Driver("Sajith","Innova");
        D1.displayDriver();
        D2.displayDriver();
        D.displayDriver();
    }
}
