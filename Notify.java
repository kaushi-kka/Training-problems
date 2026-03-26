
class Notification
{
    String name;
    String message;
    Notification(String name,String message)
    {
        this.name=name;
        this.message=message;
    }
    void send()
    {
        System.out.println("Sending notification");
    }
}
class EmailNotification extends Notification{
    EmailNotification(String name,String message)
    {
        super(name,message);
    }
        void send()
        {
            System.out.println("Sending email notification");
            System.out.println("Sendimg email to "+name);
            System.out.println("Message: "+message);
            System.out.println("_________________________________");
        }
        void changeReceiverEmail(){}
    }
class SMSNotification extends Notification{
    SMSNotification(String name,String message)
    {
        super(name,message);
    }
        void send()
        {
            System.out.println("Sending SMS NOtification");
            System.out.println("Sending SMS to "+name);
            System.out.println("Message: "+message);
            System.out.println("_________________________________");
        }
    }
public class Notify
    {
        public static void main(String[] args) 
            {
                Notification n;
                n =new EmailNotification("test","Order confirmed");
                n.send();
                n=new SMSNotification("test","Order confirmed");
                n.send();

            }
        
    }