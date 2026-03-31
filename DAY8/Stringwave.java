public class Stringwave {
    public static void main(String[] args)
    {
        //Scanner sc=new Scanner(System.in);
        String s="viratkohli";
        StringBuilder odd=new StringBuilder();
        StringBuilder even=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                even.append(s.charAt(i));
            }
            else
            {
                odd.append(s.charAt(i));
            }
        }
        System.out.print((even.toString()+odd.toString()));
    }
    
}
