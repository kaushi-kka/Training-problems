package DAY10;
class Bankaccount{
    private double balance;
    public void setBalance(double balance){
        if(balance>0)
        {
            this.balance=balance;
        }
        else{
            System.out.println("Invalid balance amount");
        }
    }
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount withdrawn: " + amount);
        }
        else{
            System.out.println("Invalid withdrawal amount");
        }
    }
    public void deposit(int amount)
    {
        if(amount>0)
            {
                balance+=amount;
                System.out.println("Amount credited: " + amount);
            }
            else{
                System.out.println("Invalid amount credited");
            }
        }
    public double getBalance(){
        return balance;
}}

public class Encapsulation 
{
    public static void main(String[] args) 
    {

    Bankaccount b=new Bankaccount();
    b.setBalance(1000);
    System.out.println(b.getBalance());
    b.withdraw(600);
    System.out.println(b.getBalance());
    b.deposit(10000);
    System.out.println(b.getBalance());
    }
}
