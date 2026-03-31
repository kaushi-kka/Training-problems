class Battery
{
    public void powerSupply()
    {
        System.out.println("still have 50% battery");
    }
}
class Remote
{
    Battery minibattery;
    Remote()
    {
     minibattery = new Battery();//has a relationship
    }
    public void changeChannel()
    {
        minibattery.powerSupply();
        System.out.println("Channel changed");
}
}
public class Relationship {
    public static void main(String[] args)
    {
        Remote remotetv=new Remote();
        remotetv.changeChannel();
    }
    
}