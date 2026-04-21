package DAY22;
import java.util.*;
class Employee{
    String name;
    int salary;
    Employee(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public String getname(){ return name;}
    public int getsalary(){ return salary;}
    public String toString(){
        return name+"-"+salary;
    }
}
public class StreamsExample {
    public static void main(String[] args)
    {
        //map
        List<Integer> nums=List.of(2,3,4,5,6);
        List<Integer> multiplyby2=nums.stream().map(i->i*2).toList();
        System.err.println("Multiply by 2=" + multiplyby2);
        List<Integer> evenNumbers=nums.stream().filter((i)->i%2==0).toList();
        int total=multiplyby2.stream().reduce(0,(a,b)->a+b);
        System.out.println("Total=" + total);
        System.out.println("Even numbers=" + evenNumbers);
        //obj
        List<Employee> employees=List.of(new Employee("Employee1",50000),new Employee("Employee2",60000));
        List<String> names=employees.stream().map((i)->i.getname()).toList();
        System.out.println("Names=" + names);
        List<Integer> salaries=employees.stream().map((i)->i.getsalary()).toList();
        System.out.println("Salaries=" + salaries);
        List<Employee> Salaries=employees.stream().filter((i)->i.getsalary()>30000).toList();
        System.out.println("High salaries=" + Salaries);

    }
    
}
