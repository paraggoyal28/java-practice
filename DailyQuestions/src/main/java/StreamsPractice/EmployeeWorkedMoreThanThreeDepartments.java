package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmployeeWithDepartment {
    String name;
    String department;

    EmployeeWithDepartment(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

public class EmployeeWorkedMoreThanThreeDepartments {
    public static void main(String[] args) {
        List<EmployeeWithDepartment> employeeDepartmentList =
              Arrays.asList(new EmployeeWithDepartment("David", "HR"),
                      new EmployeeWithDepartment("David", "IT"),
                      new EmployeeWithDepartment("David", "Sales"),
                      new EmployeeWithDepartment("Jones", "HR"),
                      new EmployeeWithDepartment("Jones", "IT"),
                      new EmployeeWithDepartment("James", "HR"),
                      new EmployeeWithDepartment("James", "IT"),
                      new EmployeeWithDepartment("James", "Sales"));

        String combinedEmployees = employeeDepartmentList.stream()
                .collect(Collectors.groupingBy(EmployeeWithDepartment::getName,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 3)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(combinedEmployees);
    }
}
