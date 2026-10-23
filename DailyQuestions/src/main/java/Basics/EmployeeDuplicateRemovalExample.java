package Basics;

import java.util.Objects;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.HashSet;

class Employee {
    String name;
    String department;

    Employee() {

    }

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public boolean equals(Object other) {
        // 1. Check if other point to this
        if (other == this) return true;

        // 2. Check for null or if the class types don't match
        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        Employee anotherEmployee = (Employee) other;

        // Fixed: use Objects.equals() to safely compare String values (handling potential nulls)
        return Objects.equals(this.name, anotherEmployee.name)
                && Objects.equals(this.department, anotherEmployee.department);
    }

    @Override
    public int hashCode() {
        // Fixed: Use Objects.hashCode() to generate a proper combined hash code
        return Objects.hash(name, department);
    }

    public String getDepartment() {
        return this.department;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.department;
    }
}

public class EmployeeDuplicateRemovalExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(
            Arrays.asList(
                new Employee("Parag", "HR"),
                new Employee("Shubham", "IT"),
                new Employee("Yadav", "HR"),
                new Employee("Shubham", "IT"),
                new Employee("Yadav", "HR")
            )
        );

        /* 
        Iterator<Employee> empIt = employees.iterator();
        Set<Employee> empSet = new HashSet<>();
        while (empIt.hasNext()) {
            Employee current = empIt.next();
            if (!empSet.add(current)) {
                empIt.remove();
            }
        }    
        employees.stream().forEach(emp -> {
            System.out.println(emp);
        });
        */

        Set<Employee> seen = new HashSet<>();

        // Directly removes duplicates from the original 'employees' 
        employees.removeIf(emp -> !seen.add(emp));

        employees.forEach(System.out::println);

       // List<Employee> distinctEmployees = employees.stream()
          //                                      .distinct()
           //                                     .toList();
        //System.out.println(distinctEmployees);
    }
}

