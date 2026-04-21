
import java.util.*;
class Employee{
    String name;
    String department;
    int salary;
    int age;
    Employee(String name,String department,int salary,int age)
    {
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.age=age;
    }
    public String getname(){ return name;}
    public String getdepartment(){ return department;}
    public int getsalary(){ return salary;}
    public int getage(){ return age;}
    public String toString(){
        return name+" "+salary+" "+department+" "+age;
    }
}
public class Streamstask {
    public static void main(String[] args) {
        List<Employee> employees=List.of(new Employee("Employee1","dev",50000,25),new Employee("Employee2","HR",60000,30),new Employee("Employee3","Support",55000,28));
        List<String> names=employees.stream().map((i)->i.getname()).toList();
        System.out.println("Names=" + names);
        List<String> departments=employees.stream().map((i)->i.getdepartment()).toList();
        System.out.println("Departments=" + departments);
        List<Integer> salaries=employees.stream().map((i)->i.getsalary()).toList();
        System.out.println("Salaries=" + salaries);
        List<Integer> ages=employees.stream().map((i)->i.getage()).toList();
        System.out.println("Ages=" + ages);

        List<Employee> highSalaries=employees.stream().filter((i)->i.getsalary()>=50000).toList();
        System.out.println("High salaries=" + highSalaries);

        List<Employee> devEmployees=employees.stream().filter((i)->i.getdepartment().equals("dev")).toList();
        System.out.println("Dev employees=" + devEmployees);

        int total=employees.stream().map((i)->i.getsalary()).reduce(0,(a,b)->a+b);
        System.out.println("Total salary=" + total);

        int sum=employees.stream().mapToInt(i->i.getsalary()).sum();
        System.out.println("Sum of salaries=" + sum);

        double average=employees.stream().mapToInt(i->i.getsalary()).average().orElse(0.0);
        System.out.println("Average salary=" + average);

        long count=employees.stream().count();
        System.out.println("Total employees=" + count);

    }
    
}
