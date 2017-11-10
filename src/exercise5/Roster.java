package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Roster
 * Task 10: Create a class Roster that contains a private member ArrayList<Student> studentList (reuse class Student from task 9). Its constructor must take the name of a file as a parameter, read data from the file (sample roster.csv is provided, another file of a similar structure may be used for grading), create an object of type Student based on the content of a line, and add that object to the ArrayList studentList.
 * Implement method printRoster that prints all the elements of the studentList.
 * @author woolsa01
 */
public class Roster {
    private ArrayList<Student> studentList = new ArrayList<Student>();
    
public Roster(String filename) throws FileNotFoundException, IOException {
    BufferedReader inputFile = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = inputFile.readLine()) != null) {
        Scanner lineContent = new Scanner(line);
        lineContent.next();
        String[] parts = line.split(",");
        Student newStudent = new Student(parts[0], parts[1], Double.parseDouble(parts[2]));
        studentList.add(newStudent);
    }
}

public void printRoster() {
    for (int i = 0; i < studentList.size(); ++i) {
        System.out.println(studentList.get(i).toString());
    }
}
}
