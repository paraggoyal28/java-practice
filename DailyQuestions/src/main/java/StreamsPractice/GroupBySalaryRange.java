package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

enum SalaryRange {
    HIGH, LOW, MEDIUM
};

class EmployeeSalary {
    String name;
    double salary;

    EmployeeSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public String toString() {
        return "[Name]: " + name + ", [Salary]:" + salary;
    }
}

public class GroupBySalaryRange {
    public static void main(String[] args) {
        List<EmployeeSalary> employees = Arrays.asList(new EmployeeSalary("Ramesh", 70000),
                new EmployeeSalary("Rajesh", 30000),
                new EmployeeSalary("Kamlesh", 50000),
                new EmployeeSalary("Rakesh", 60000),
                new EmployeeSalary("Parag", 105000),
                new EmployeeSalary("Pranav", 107000));
        Map<SalaryRange, List<EmployeeSalary>> employeesBySalaryRange
                    = employees.stream().collect(Collectors.groupingBy(
                            e -> getSalaryRange(e.getSalary())
        ));
        System.out.println(employeesBySalaryRange);
    }

    private static SalaryRange getSalaryRange(double salary) {
        if (salary <= 50000) return SalaryRange.LOW;
        else if (salary <= 100000) return SalaryRange.MEDIUM;
        else return SalaryRange.HIGH;
    }
}
