package L12Inheritance;
import L12Inheritance.Employees.Employee;
//only public classes can be imported

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Peter", "Barker", "Photographer", 3000, 14);
        System.out.println(e);
    }
}
//use inheritance when 2 or more classes share the same characteristics
