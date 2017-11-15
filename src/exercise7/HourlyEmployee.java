package exercise7;

/**
 *
 * @author woolsa01
 */
public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;

public HourlyEmployee(String name, String ssn, double wageRate, double hours) {
    super(name, ssn);
    this.wageRate = wageRate;
    this.hours = hours;
}

public double getWageRate() {
    return wageRate;
}

public void setWageRate(double input) {
    this.wageRate = input;
}

public double getHours() {
    return hours;
}

public void setHours(double input) {
    this.hours = input;
}

    @Override
    public double getNetPay() {
    return hours * wageRate;
}
    
    @Override
    public void printWeeklyCheck() {
    System.out.printf("%.2f%n", getNetPay()/52);
}
}
