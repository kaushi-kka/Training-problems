import java.util.*;
public class FirstNonRepChar
{
	public static void main(String[] args) 
	{
	    String s="ababcdcdefg";
	    for(int i=0;i<s.length();i++)
	    {
	        int count=0;
	        for(int j=0;j<s.length();j++)
	        {
	            if(s.charAt(j)==s.charAt(i))
	            {
	                count++;
	            }
	        }
	        if(count==1)
	        {
	            System.out.print(s.charAt(i));
	            break;
	        }
	        }
	    }
	}

