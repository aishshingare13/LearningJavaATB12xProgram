package Coding_Challeange_P2;

public class SalaryCalculation {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 60000, 10000);
        Developer developer = new Developer("Bob", 50, 160);

        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }
}
abstract class Employee1 {
    String name;

    Employee1(String name) {
        this.name = name;
    }

    abstract double calculateSalary();
}
class Manager extends Employee1 {
    double baseSalary;
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}
class Developer extends Employee1 {
    double hourlyRate;
    int hoursWorked;

    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}