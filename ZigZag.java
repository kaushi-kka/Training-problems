import java.util.*;
public class ZigZag
{
static String zigzag(String S,int Rows)
{
    if(Rows==1) return S;
    StringBuilder[] sb=new StringBuilder[Rows];
    for(int i=0;i<Rows;i++)
    {
        sb[i]=new StringBuilder();
    }
    
}

public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int rows=sc.nextInt();
        System.out.println(zigzag(s,rows));
    }
}
