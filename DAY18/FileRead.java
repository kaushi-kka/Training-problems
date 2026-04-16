package DAY18;
//import java.io.BufferedReader;
import java.io.FileReader;
public class FileRead {
    public static void main(String[] args) {
        try{
            // BufferedReader reader1= new BufferedReader(new FileReader("test.txt"));  
            // String line;
            // while((line=reader1.readLine())!=null)
            // {
            //     System.out.println(line);
            // }
            FileReader reader= new FileReader("test.txt");
            int i;
            while((i=reader.read())!=-1)
            {
                System.out.print((char)i);
            }
            //reader.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
