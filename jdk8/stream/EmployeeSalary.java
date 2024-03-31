import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeSalary {
    public static void main(String[] args) {
        
        // Fetch all Grade Employees
        List<Employee> list = EmpDB.getAllEmps();

        // Print all Emplyee whose grade 
        list.stream()
            .filter(e -> e.getGrade().equalsIgnoreCase("A"))
            .forEach(e -> System.out.println( e));

        // Print Grade-A Emp average salary
        Double avgEmpSalary = list.stream()
                             .filter(e -> e.getGrade().equalsIgnoreCase("A"))
                             .collect(Collectors.averagingDouble(Employee::getSalary));
                             
                            // OR
                            //  .map(e -> e.getSalary())
                            //  .mapToDouble( e -> e)
                            //  .average().getAsDouble();
        System.out.println("Average Employee Salary: " + avgEmpSalary);
    }
}

class EmpDB{
    public static List<Employee> getAllEmps(){
        return Stream.of(
            new Employee(101, "Johnson", "A", 60000),
            new Employee(109, "Max", "B", 30000),
            new Employee(103, "Bravo", "A", 80000),
            new Employee(104, "Deviliers", "A", 90000),
            new Employee(105, "Russel", "C", 15000)
        ).collect(Collectors.toList());
    }
}

class Employee{
    private int id;
    private String name;
    private String grade;
    private double salary;
    
    public Employee(int id, String name, String grade, double salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", grade=" + grade + ", salary=" + salary + "]";
    }
}
