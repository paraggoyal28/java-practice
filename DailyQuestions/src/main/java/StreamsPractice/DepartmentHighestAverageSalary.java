package StreamsPractice;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class EmployeeDepartment {
    private int id;
    private String name;
    private double salary;
    private String department;

    EmployeeDepartment(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "EmployeeDepartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

public class DepartmentHighestAverageSalary {
    public static void main(String[] args) {
        List<EmployeeDepartment> employeeWithDepartmentList =
                Arrays.asList(new EmployeeDepartment(1, "Harshit", 30000, "HR"),
                        new EmployeeDepartment(2, "Pranav", 23000, "HR"),
                        new EmployeeDepartment(3, "Prashant", 27000, "HR"),
                        new EmployeeDepartment(4, "Ruchi", 34000, "IT"),
                        new EmployeeDepartment(5, "Kalaash", 45000, "IT"),
                        new EmployeeDepartment(6, "Ramesh", 46000, "IT"));
        Map.Entry<String, Double> departmentWithHighestSalary = employeeWithDepartmentList.stream()
                .collect(Collectors.groupingBy(EmployeeDepartment::getDepartment,
                        Collectors.averagingDouble(EmployeeDepartment::getSalary)))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println("Department with highest average salary: " + departmentWithHighestSalary);
    }
}
