import java.util.*;
class Student{
    int id;
    String name;
    int mark;
    Student(int id,String name,int mark)
    {
        this.name=name;
        this.mark=mark;
    }
}
public class ComparatorExample {
    public static void main(String[] args)
    {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1,"Alice",85));
        students.add(new Student(2,"Bob",90));
        students.add(new Student(3,"Charlie",80));
        Comparator<Student> bymark=(s1,s2)->s1.mark-s2.mark;
        Collections.sort(students,bymark);
        for(Student student:students)
        {
            System.out.println(student.name+" "+student.mark);
        }   
    }   
}
