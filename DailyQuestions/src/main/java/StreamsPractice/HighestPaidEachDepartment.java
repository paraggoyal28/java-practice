package StreamsPractice;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEachDepartment {
    public static void main(String[] args) {
        List<EmployeeDepartment> employeeWithDepartmentList =
                Arrays.asList(new EmployeeDepartment(1, "Harshit", 30000, "HR"),
                        new EmployeeDepartment(2, "Pranav", 23000, "HR"),
                        new EmployeeDepartment(7, "Ujesh", 23000, "HR"),
                        new EmployeeDepartment(3, "Prashant", 27000, "Sales"),
                        new EmployeeDepartment(4, "Ruchi", 34000, "Accounts"),
                        new EmployeeDepartment(5, "Kalaash", 45000, "IT"),
                        new EmployeeDepartment(5, "Rajest", 41000, "IT"),
                        new EmployeeDepartment(6, "Ramesh", 46000, "IT"));
        Map <String, Optional<EmployeeDepartment>> departmentWithMaxSalaryEmployee =
                employeeWithDepartmentList.stream()
                .collect(Collectors.groupingBy(EmployeeDepartment::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(EmployeeDepartment::getSalary))));

        System.out.println(departmentWithMaxSalaryEmployee);

    }
}
