package exercise4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Sam Woollums
 * @assignment Exercise4
 */
public class Ex4Driver {

  /*
  Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
    */
public Integer task1(Integer n) {
    return n;
}
/*
Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
*/
public Integer task2(String text) {
    return text.length();
}

/*
Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
*/
public Integer task3(Character c) {
    return c.hashCode();
}
/*
Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity.
*/
public Character task4(String c) {
    return c.charAt(0);
}
/*
Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
*/
public Integer task5(Integer a, Integer b) {
    return a + b;
}
/*
Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity.
*/
public Character task6(String text, Integer n) {
    return text.charAt(n);
}
/*
Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
*/
public Integer task7(Integer[] array) {
    return array.length;
 }
/*
Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity.
*/
public Boolean task8(Integer[] array, Integer n) {
    return array.length > n;
}
/*
Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
*/
public Integer task9(ArrayList<String> array) {
    return array.size();
}
/*
Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
*/
public Integer task10(HashMap<Integer, Integer> hashbrown) {
    return hashbrown.size();
}
}
