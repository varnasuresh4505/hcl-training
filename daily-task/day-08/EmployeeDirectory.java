import java.util.*;
class Employee implements Comparable<Employee> 
{
    int id;
    String name;
    String department;
    double salary;
    Employee(int id, String name, String department, double salary) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee other) 
    {
        return Integer.compare(this.id, other.id);
    }
}
public class EmployeeDirectory 
{
    public static void main(String[] args) 
    {
        Employee e1 = new Employee(103, "Arun", "IT", 75000);
        Employee e2 = new Employee(101, "Priya", "HR", 50000);
        Employee e3 = new Employee(102, "Kavi", "IT", 85000);
        Employee e4 = new Employee(104, "Divya", "HR", 60000);
        Employee e5 = new Employee(105, "Ravi", "Sales", 45000);
        Employee e6 = new Employee(106, "Meena", "IT", 90000);
        Map<Integer, Employee> employees = new HashMap<>();
        employees.put(e1.id, e1);
        employees.put(e2.id, e2);
        employees.put(e3.id, e3);
        employees.put(e4.id, e4);
        employees.put(e5.id, e5);
        employees.put(e6.id, e6);
        System.out.println("=== EMPLOYEE LOOKUP ===");
        Employee result = employees.get(102);
        if(result != null) 
        {
            System.out.println(result.id + " " + result.name + " " + result.department + " " + result.salary);
        } 
        else 
        {
            System.out.println("Employee not found");
        }
        Map<String, Integer> count = new HashMap<>();
        for(Employee e : employees.values()) 
        {
            count.merge(e.department, 1, Integer::sum);
        }
        System.out.println("\n=== DEPARTMENT COUNTS ===");
        System.out.println(count);
        Map<String, Integer> sortedCount = new TreeMap<>(count);
        System.out.println("\n=== SORTED DEPARTMENT REPORT ===");
        System.out.println(sortedCount);
        List<Employee> list = new ArrayList<>(employees.values());
        Collections.sort(list);
        System.out.println("\n=== EMPLOYEES SORTED BY ID ===");
        for(Employee e : list) 
        {
            System.out.println(e.id + " " + e.name);
        }
    }
}
