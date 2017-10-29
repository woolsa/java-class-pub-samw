package exercise1;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 * @author Sam Woollums
 * @asssignment exercise1
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
 }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println("---Task 1---");
    System.out.println("Hello World");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    System.out.println("");
    System.out.println("---Task 2---");
    for (int i = 1; i <=100; ++i) {
        if (i % 3 == 0) {
            System.out.println("foo");
        }
        else {
            System.out.println(i);
        }  
    }
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    System.out.println("");
    System.out.println("---Task 3---");   
    int sum = 0; 
    for (int i = 1; i <=100; ++i) {   
      if (i % 7 == 0) {
          sum += i;
      }
    }
    System.out.println("The sum of all multiples of 7 between 1 and 100 is " + sum);
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    System.out.println("");
    System.out.println("---Task 4---");
    int sum = 0;
    long prod = 1;
    for (int i = 1; i <= 20; ++i) {
        sum += i;
        prod *= i;        
    }
    System.out.println("The sum of all numbers between 1 and 20 is " + sum); 
    System.out.println("The product of all numbers between 1 and 20 is " + prod);
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    System.out.println("");
    System.out.println("---Task 5---");
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your full name");
    String fullName = keyboard.nextLine();
    String[] nameSplit = fullName.split(" ");
    String initials = "";
    for (int i = 0; i < nameSplit.length; ++i) {
        char initial = nameSplit[i].charAt(0);
        initials += initial;
    }    
    System.out.printf("Your initials are %s%n", initials);
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    System.out.println("");
    System.out.println("---Task 6---");
    int[] cubed = new int[10];
    for (int i = 0; i < cubed.length; ++i) {
        cubed[i] = i * i * i;
    }
    for (int i = 0; i < cubed.length; ++i) {
       System.out.printf("%d ", cubed[i]);
    }
    System.out.printf("%n");
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    System.out.println("");
    System.out.println("---Task 7---");
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] randomNumbers = new int[100];
    for (int i = 0; i < randomNumbers.length; i++) {
      randomNumbers[i] = rnd.nextInt(100) + 1;
    }
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number");
    Integer guess = keyboard.nextInt();
    boolean found = false;
    for (int index = 0; index < randomNumbers.length; ++index) {
        if (randomNumbers[index] == guess) {
            found = true;
            break;
        }
    }    
    if (found == true)  {
        System.out.printf("%d was found in the array%n", guess);
        }
    else {
        System.out.printf("%d was NOT found in the array%n", guess);
        }
    }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    System.out.println("");
    System.out.println("---Task 8---");
    int sum = 0;
    String arrayNums = "";
    for (int i = 0; i < numbers.length; ++i) {
        sum += numbers[i];
        arrayNums += numbers[i] + " ";
    }
    System.out.printf("Sum of all items in [%s] is %d%n", arrayNums, sum);
    return sum;
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    System.out.println("");  
    System.out.println("---Task 9--");
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a word");
    String word = keyboard.nextLine();
    if (orderedWord(word)) {
        System.out.printf("Letters of %s are in order%n", word);
    }
    else {
        System.out.printf("Letters of %s are NOT in order%n", word);
    }
    return orderedWord(word);
  }
  
  public static boolean orderedWord(String word) {
      String[] splitWord = word.split("");
      Arrays.sort(splitWord);
      String orderedWord = "";
      for (int i = 0; i < splitWord.length; ++i) {
         orderedWord += splitWord[i]; 
      }
      return word.equals(orderedWord);
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    System.out.println("");
    System.out.println("---Task 10--");
    int n = 100;
    boolean[] isPrime = new boolean[n+1];
    for (int i = 2; i <= n; i++) {
        isPrime[i] = true;
    }

    for (int factor = 2; factor*factor <= n; factor++) {
        if (isPrime[factor]) {
            for (int j = factor; factor*j <= n; j++) {
                isPrime[factor*j] = false;
            }
        }
    }
    for (int i = 0; i <= n; i++) {
        if (isPrime[i]) {
            System.out.printf("%d ", i);
        }
    }
  }
}


