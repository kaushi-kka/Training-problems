package DAY19;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
    CustomObjectOutputStream(ObjectOutputStream objStream) throws IOException {
        super(objStream);
    }
    @Override
    protected void writeStreamHeader(){
    }
}
public class SerializationExample {
    public static void main(String[] args) throws IOException{
        Student s=new Student("ABC",90);
        FileOutputStream fo=new FileOutputStream("student.txt");//open file
        ObjectOutputStream objStream=new ObjectOutputStream(fo);//obj to byte stream
        objStream.writeObject(s);//writing on files
        fo.close();
        objStream.close();
    }
        
}
