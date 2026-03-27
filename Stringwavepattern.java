import java.util.*;
public class Stringwavepattern {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length()-1;i++)
        {
            if(i%2==0)
            {
                System.out.print(s.charAt(i));
            }
        }
            for(int i=0;i<s.length();i++)
            {
                if(i%2!=0)
                {
                    System.out.print(s.charAt(i));
                }
            }


    }
}

