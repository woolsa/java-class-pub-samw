package exercise5;

/**
 * Class Employee
 * Task 3: Create a class Employee with the following private data members: String firstName, String lastName, double salary, boolean fullTime. The string representation of an object of this class depends on the value of the isFullTime member. If an employee is full time, their salary is reported as annual, otherwise it's hourly.
 * @author woolsa01
 */
public class Employee {
    private final String firstName;
    private final String lastName;
    private final double salary;
    private final boolean fullTime;
    
public Employee(String firstName, String lastName, double salary, boolean fullTime) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.fullTime = fullTime;
}

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public double getSalary() {
    return salary;
}

public boolean isFullTime() {
    return fullTime;
}

    @Override
    public String toString() {
    if (fullTime) {
        return String.format("%s %s earns $%.2f annually", firstName, lastName, salary);
    }
    else {
        return String.format("%s %s earns $%.2f hourly", firstName, lastName, salary);
    }
}

}
