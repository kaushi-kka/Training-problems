package DAY10;

class Locker{
    private int lockerid;
    private boolean isLocked;
    private int pinCode;
    private String storedItem;
    Locker(int lockerid,int pinCode)
    {
        this.lockerid=lockerid;
        this.pinCode=pinCode;
        this.isLocked=true;
    }
    public void storeItem(String item,int pin)
    {
        if(pin==pinCode){
            if(!isLocked)
            {
                storedItem=item;
                System.out.println("Item stored successfully");
            }
            else
                {
                    System.out.println("Locker is locked");
                }
    }
        else
            {
                System.out.println("Wrong pin code");
            }
}
        public void retrieveItem(int pin)
        {
            if(pin==pinCode)
                {
                if(!isLocked&&storedItem != null)
                    {
                        System.out.println("Item retrieved: " + storedItem);
                        storedItem = null;
                    }
                else
                    {
                        System.out.println("Locker is locked");
                    }
                }
            else
                {
                    System.out.println("Wrong pin code");
                }
        }
        public void unlock(int pin)
        {
            if(pin==pinCode)
            {
                isLocked=false;
                System.out.println("Locker unlocked");
            }
            else{
                System.out.println("Wrong pin");
            }
        }
        public void lock()
        {
            isLocked=true;
            System.out.println("Locker locked");
        }
}
public class LockerSystem
{
    public static void main(String[] args)
    {
        Locker l1= new Locker(001,12345);
        l1.unlock(12345);
        l1.storeItem("Jewels",12345);
        l1.retrieveItem(12345);
        l1.lock();
    }
}
   