package exercise7;

/**
 *
 * @author woolsa01
 */
public class Employee {
    private String name;
    private String ssn = "000-00-0000";
    private double netPay;
    
public Employee(String name, String ssn) {
    this.name = name;
    this.ssn = ssn;
}

public String getName() {
    return name;
}

public void setName(String input) {
    this.name = input;
}

public String getSSN() {
    return ssn;
}

public void setSSN(String input) {
    this.ssn = input;
}

public double getNetPay() {
    return netPay;
}
 
public void printWeeklyCheck() {
    System.out.printf("%.2f%n", netPay/52);
}
}
