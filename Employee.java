import java.time.LocalTime;

public class Employee {
    private int id;
    private String name;
    private String position;
    private double baseSalary;
    private boolean isHourly;
    private LocalTime employmentTime;
    private double bonus;
    private double deductions;

    public void setEmploymentTime(LocalTime employmentTime) {
        this.employmentTime = employmentTime;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double calculateSalary() {
        double finalSalary = 0;
        if (isHourly) {
            finalSalary = calculateHourlyPay();
        } else {
            finalSalary = calculateBaseSalary();
        }
        finalSalary += bonus;
        finalSalary -= deductions;
        return finalSalary;
    }

    private double calculateHourlyPay() {
        double salary = 0;
        int overtimeThreshold = 40;
        double overtimeRate = 1.5;

        int hoursWorked = 0; // You need to retrieve hours worked here. This is just a placeholder.

        if (hoursWorked > overtimeThreshold) {
            salary += overtimeThreshold * baseSalary;
            salary += (hoursWorked - overtimeThreshold) * baseSalary * overtimeRate;
        } else {
            salary += hoursWorked * baseSalary;
        }

        return salary;
    }

    private double calculateBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }
}
