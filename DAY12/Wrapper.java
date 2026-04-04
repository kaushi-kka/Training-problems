package DAY12;

public class Wrapper {
    public static Integer test1(String s)
    {
        return Integer.valueOf(s);
    }
    public static void main(String[] args)
        {
            Integer b=Integer.valueOf("12345");//return type->object(Integer)
            Integer c=Integer.parseInt("0987");//return type->int(int)
            int a=b.intValue();//unboxing
            Integer x=127;
            Integer y=127;
            Integer z=128;
            z=130;
            System.out.println(z.equals(130));
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
            System.out.println(test1("123"));
            System.out.print(x==y);//if x and y are equal and <=127, return true , else returns false.
        }
}
