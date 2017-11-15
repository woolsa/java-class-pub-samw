package exercise7;

/**
 *
 * @author woolsa01
 */
public class SalariedEmployee extends Employee {
    private double salary;

public SalariedEmployee(String name, String ssn, double salary) {
    super(name, ssn);
    this.salary = salary;
}

public double getSalary() {
    return salary;
}

public void setSalary(double input) {
    this.salary = input;
}

    @Override
    public double getNetPay() {
    return salary;
}

    @Override
    public void printWeeklyCheck() {
    System.out.printf("%.2f%n", getNetPay()/52);
}
}
