package DAY11;

public class Except {
    public static void main(String[] args) {
        
        try
        {
        //     int a=10;
        // int b=0;
        // int c=a/b;
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(NullPointerException e)
        {
            System.out.println("String is null");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
