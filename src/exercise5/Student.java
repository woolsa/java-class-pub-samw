package exercise5;

/**
 * Class Student
 * Task 9: Create a class Student with the following private data members: String name, String major, double gpa.
 * Implement setters for major and gpa
 * @author woolsa01
 */
public class Student {
    private final String name;
    private String major;
    private double gpa;
    
public Student(String name, String major, double gpa) {
    this.name = name;
    this.major = major;
    this.gpa = gpa;
}

public String getName() {
    return name;
}

public String getMajor() {
    return major;
}

public void setMajor(String input) {
    major = input;
}

public double getGpa() {
    return gpa;
}

public void setGpa(double input) {
    gpa = input;
}

    @Override
    public String toString() {
    return String.format("%s is majoring in %s with a GPA of %.1f", name, major, gpa);
}
}