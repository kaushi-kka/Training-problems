class User
{
    String name;
    String phone;
    String location;
    User(String name,String phone,String location)
    {
        this.name=name;
        this.phone=phone;
        this.location=location;
    }
    void displayInfo()
    {
        System.out.println("Name:"+name);
        System.out.println("Phone:"+phone);
        System.out.println("Location:"+location);
        System.out.println("_____________________________");
    }
}
class RideInfo extends User
{
    String vehicletype;
    RideInfo(String vehicletype)
    {
        this.vehicletype=vehicletype;
    }
    void displayRide()
    {
        displayInfo();
        System.out.println("Vehicle Type:"+vehicletype);
        
    }
}
class FoodInfo extends User
{
    String favfood;
    FoodInfo(String favfood)
    {
        this.favfood=favfood;
    }
    void displayFood()
    {
        displayInfo();
        System.out.println("Favourite Food:"+favfood);
        
    }
}
class ParcelInfo extends User
{
    String parcelweight;
    ParcelInfo(String parcelweight)
    {
        this.parcelweight=parcelweight;
    }
    void displayParcel()
    {
        displayInfo();
        System.out.print("Parcel Weight: "+parcelweight);
    }
}
    public class MultipleBooking 
    {
        public static void main(String[] args)
    {
        
        User n=new User("Kaushi", "9837462891", "Villivakkam");
        n.displayInfo();
        RideInfo n1= new RideInfo("Yamaha");
        n1.displayRide();
        FoodInfo n2=new FoodInfo("Biryani");
        n2.displayFood();
        ParcelInfo n3=new ParcelInfo("5kg");
        n3.displayParcel();
}
}
