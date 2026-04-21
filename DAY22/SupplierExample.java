import java.util.function.Supplier;

class Person{
    String name="Supplier";
}
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> s=()->(int)(Math.random()*100);
        System.out.println(s.get());
        Supplier<Person> s1=()->new Person();
        System.err.println(s1.get().name);
    }
}    

