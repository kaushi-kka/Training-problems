package DAY10;
class Bankaccount{
    private double balance;
    public void setBalance(double balance){
        this.balance=balance;
    }
}
public class Encapsulation 
{
    public static void main(String[] args) 
    {
    Bankaccount b=new Bankaccount();
    b.balance+=-1000;
    System.out.print(b.balance);
    }
}
