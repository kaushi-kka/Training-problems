
 class Shopping
{
    int id;
    String name;
    double price;
    int quantity;

Shopping(int id,String name,double price,int quantity)
{
    this.id=id;
    this.name=name;
    this.price=price;
    this.quantity= quantity;
    
}
double getTotalprice()
{
    return price*quantity;
}
void display()
{
    System.out.println("Name:"+name);
    System.out.println("Price:"+price);
    System.out.println("Quantity:"+quantity);
    System.out.println("Total Price:"+getTotalprice());
    System.out.println("*******************************");
}
}
public class Shop
{
	public static void main(String[] args) {
	    Shopping p1=new Shopping(1,"shampoo",250.0,1);
	    Shopping p2=new Shopping(2,"soap",100.0,2);
	    Shopping p3=new Shopping(3,"moisturizer",300.0,1);
	    double grandtotal=0;
	    Shopping[] arr={p1,p2,p3};
	    for(Shopping p:arr)
	    {
	        p.display();
	        grandtotal+=p.getTotalprice();
	    }
	    System.out.print("GrandTotal:"+grandtotal);
}
    
}