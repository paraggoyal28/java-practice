package StreamsPractice;

/*
sort employees by salary
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    double salary;
    Employee() {}
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class SortEmployeesBySalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ramesh", 20000),
                new Employee("Rajesh", 40000),
                new Employee("Parag", 33423),
                new Employee("Arun", 80000)
        );
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList();
        System.out.println("Employees sorted by salary:");
        System.out.println(sortedEmployees);
    }
}
