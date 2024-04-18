import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Department> departments;

    public PayrollSystem(List<Department> departments) {
        this.departments = departments;
    }

    // Getter and setter methods for departments
    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    // Main method to run the payroll system
    public static void main(String[] args) {
        // Creating departments
        Department department1 = new Department("Department 1");
        Department department2 = new Department("Department 2");

        // Adding employees to departments
        department1.addEmployee(new Employee(/* employee details */));
        department1.addEmployee(new Employee(/* employee details */));
        department2.addEmployee(new Employee(/* employee details */));

        // Creating a list of departments
        List<Department> departments = new ArrayList<>();
        departments.add(department1);
        departments.add(department2);

        // Creating a payroll system
        PayrollSystem payrollSystem = new PayrollSystem(departments);

    }
}
