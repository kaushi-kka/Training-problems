import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student implements Comparable<Student>
{
    String name;
    int mark;
    Student(String name,int mark)
    {
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compareTo(Student s)
    {
        return this.mark-s.mark;
    }
    @Override
    public String toString()
    {
    return name+" "+mark;
    }
}
public class ComparableExample {
    public static void main(String[] args)
    {
        List<Student> s=new ArrayList<>();
        s.add(new Student("Alice",85));
        s.add(new Student("Bob",90));
        s.add(new Student("Charlie",75));
        Collections.sort(s);
        for(Student student:s)
        {
            System.out.println(student.name+" "+student.mark);
        }
        System.out.println(s);
    }
}