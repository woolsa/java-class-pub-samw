package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Sam Woollums
 * @assignment Exercise2
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    task1(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(task8(numberLst, 75));
    //task9();
    task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row.
   * @param n
   */
  public static void task1(int n) {
      System.out.println("---Task 1---");
      nHeads(n);        
  }
  
  public static void nHeads(int n) {
      Random rnd = new Random();
      rnd.setSeed(252);
      int heads = 0;
      while (heads != n) {
          int flip = rnd.nextInt(2);
          if (flip == 0) {
              heads++;
              System.out.printf("Heads ");
          }
          else {
              System.out.printf("Tails ");
          }
      }
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
      System.out.printf("%n%n");
      System.out.println("---Task 2---");
      for (int i = 0; i < arr.length; ++i) {
          if (arr[i] > n) {
              return false;
          }
      }
      return false;
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
    System.out.println("");
    System.out.println("---Task 3---");
    int nBelowThresh = 0;
    for (int i = 0; i < arr.length; ++i) {
        if (arr[i] < threshold) {
            nBelowThresh++;
        }
    }
    return nBelowThresh;
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
    System.out.println("");
    System.out.println("---Task 4---");
    int max = 0;
    for (int i = 0; i < arr.length; ++i) {
        if (arr[i] > max) {
            max = arr[i];
        }   
    }
    for (int i = 0; i < arr.length; ++i) {
        arr[i] += 100 - max;
        System.out.printf("%d ", arr[i]);
    }
  }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
    System.out.printf("%n%n");
    System.out.println("---Task 5---");
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int f = 0;
    for (int i = 0; i < arr.length; ++i) {
        if (arr[i] >= 90) {
            ++a;
        }
        else if (arr[i] >= 80) {
            ++b;
        }
        else if (arr[i] >= 70) {
            ++c;
        }
        else if (arr[i] >= 60) {
            ++d;
        }
        else {
            ++f;
        }  
    }
    System.out.printf("A: %d%nB: %d%nC: %d%nD: %d%nF: %d%n", a, b, c, d, f);
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    System.out.println("");
    System.out.println("---Task 6---");
    ArrayList<Double> arr = new ArrayList();
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number (or 0 to stop):");
    Double input = keyboard.nextDouble();
    while (input != 0.0) {
        arr.add(input);
        System.out.println("Please another integer (and 0 if done):");
        input = keyboard.nextDouble();
    }
    System.out.print("");
    System.out.print(arr);
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
    System.out.printf("%n%n");
    System.out.println("---Task 7---");
    Random rnd = new Random();
    rnd.setSeed(252);
    ArrayList<Integer> randomNums = new ArrayList();
    for (int i = 0; i < 10; ++i) {
        randomNums.add(rnd.nextInt(51) + 50);
    }
    for (int i = 0; i < randomNums.size(); i++) {
      System.out.printf("%d ", randomNums.get(i));
    }
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    System.out.printf("%n%n");
    System.out.println("---Task 8---");
    int numBelow = 0;
    for (int i = 0; i < arrLst.size(); ++i) {
        if (arrLst.get(i) < threshold) {
            ++numBelow;
        }
    }
    return numBelow;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    System.out.println("");
    System.out.println("---Task 9---");
    int[][] matrix = new int[10][10];
    for (int i = 0; i < matrix.length; ++i) {
        for (int j = 0; j < matrix[0].length; ++j) {
            matrix[i][j] = (i+1) * (j+1);
            System.out.printf("%5d", matrix[i][j]);
        }
    System.out.println("");    
    }
    return matrix;
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
    System.out.println("");
    System.out.println("---Task 10---");
    int[] colSum = new int[matrix[0].length];
    for (int i = 0; i < matrix.length; i++){
        int sum = 0;
        for (int j = 0; j < matrix[i].length; j++){                
            sum += matrix[i][j];
            colSum[j] += matrix[i][j];
        }
    System.out.printf("Sum of row %d = %d%n", i+1, sum);
    }  
    for (int k = 0; k < colSum.length; k++){
        System.out.printf("Sum of column %d = %d%n", k+1, colSum[k]);
    } 
  }

}
