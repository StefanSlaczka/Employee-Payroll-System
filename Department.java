import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Department {
  private String name;
  private List<Employee> employees;

  public Department(String name) {
    this.name = name;
    this.employees = new ArrayList<>();
  }

  // Getter and setter methods for name
  public String getName() {
    return name;
}

  public void setName(String name) {
    this.name = name;
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  // Method to remove an employee from the department
  public void removeEmployee(Employee employee) {
    employees.remove(employee);
  }

  // Method to calculate the total salary of the department
  public double calculateTotalSalary() {
    double totalSalary = 0;
    for (Employee employee : employees) {
      totalSalary += employee.calculateSalary();
    }
    return totalSalary;
  }

  // Method for any other department-specific functionalities
  // For example, printing department details
  public void printDepartmentDetails() {
    System.out.println("Department: " + name);
    System.out.println("Number of Employees: " + employees.size());
    System.out.println("Total Salary: " + calculateTotalSalary());
    System.out.println("Employee Details:");
    for (Employee employee : employees) {
      System.out.println(employee.getName() + " - " + employee.calculateSalary());
    }
  }
}
