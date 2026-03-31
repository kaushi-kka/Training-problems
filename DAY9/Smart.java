abstract class SmartDevice
{
    abstract void turnOn();
    abstract void turnOff();
    abstract void setLevel(int level);
    void deviceInfo()
    {
        System.out.println("This is a smart device");
    }
}
class Light extends SmartDevice
{
    @Override
    void turnOn()
    {
        System.out.println("Light turned on");
    }
    @Override
    void turnOff()
    {
        System.out.println("Light turned off");
    }
}
class Fan extends SmartDevice
{
    void setLevel(int level)
    {
        System.out.println("Fan level set to "+level);
    }
    @Override
    void turnOn()
    {
        System.out.println("Fan turned on");
    }
    @Override
    void turnOff()
    {
        System.out.println("Fan turned off");
    }
}
class AC extends SmartDevice
{
    @Override
    void setLevel(int level)
    {
        System.out.println("AC level set to "+level);
    }
    @Override
    void turnOn()
    {
        System.out.println("AC turned on");
    }
    @Override
    void turnOff()
    {
        System.out.println("AC turned off");
}
}
interface Remote
{
    void change();
}
interface wificontrol
{
    void connectWifi();
}
class TV implements Remote,wifiControl
{
    @Override
    public void change()
    {
        System.out.println("TV channel change");
    }
    @Override
        public void connectWifi()
        {
            System.out.println("connet wifi to TV");
        }
    
}
    public class Smart {
        public static void main(String[] args) 
            {
                SmartDevice device1=new Light();
                device1.deviceInfo();
                device1.turnOn();
                device1.turnOff();
                SmartDevice device2=new Fan();
                device2.turnOn();
                device2.setLevel(4);
                device2.turnOff();
                SmartDevice device3=new AC();
                device3.turnOn();
                device3.setLevel(20);
                device3.turnOff();
                

            }
}
