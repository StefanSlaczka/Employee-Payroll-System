import java.time.LocalTime;

public class Employee {
    private int id;
    private String name;
    private String position;
    private double baseSalary;
    private boolean isHourly;
    private LocalTime employmentTime;

    public void setEmploymentTime(LocalTime employmentTime) {
        this.employmentTime = employmentTime;
    }

    public double calculateSalary() {
        double finalSalary = 0;
        if (isHourly) {
            finalSalary = calculateHourlyPay();
        } else {
            finalSalary = calculateBaseSalary();
        }
        return finalSalary;
    }
    
    private double calculateHourlyPay() {
        double salary = 0;
        int overtimeThreshold = 40;
        double overtimeRate = 1.5;

        int hoursWorked = 0;
        
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
}
