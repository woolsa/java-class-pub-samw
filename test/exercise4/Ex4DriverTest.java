/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author woolsa01
 */
public class Ex4DriverTest {
    
    public Ex4DriverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of task1 method, of class Ex4Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("task1");
        Integer n = 10;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 10;
        Integer result = instance.task1(n);
        assertEquals(expResult, result);
        n = 8;
        expResult = 8;
        result = instance.task1(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task2 method, of class Ex4Driver.
     */
    @Test
    public void testTask2() {
        System.out.println("task2");
        String text = "Hello";
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 5;
        Integer result = instance.task2(text);
        assertEquals(expResult, result);
        text = "Good Bye";
        result = instance.task2(text);
        expResult = 8;
        assertEquals(expResult, result);
    }

    /**
     * Test of task3 method, of class Ex4Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        Character c = 'a';
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 97;
        Integer result = instance.task3(c);
        assertEquals(expResult, result);
        c = 'A';
        expResult = 65;
        result = instance.task3(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of task4 method, of class Ex4Driver.
     */
    @Test
    public void testTask4() {
        System.out.println("task4");
        String c = "text";
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 't';
        Character result = instance.task4(c);
        assertEquals(expResult, result);
        c = "hello";
        expResult = 'h';
        result = instance.task4(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of task5 method, of class Ex4Driver.
     */
    @Test
    public void testTask5() {
        System.out.println("task5");
        Integer a = 5;
        Integer b = 7;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 12;
        Integer result = instance.task5(a, b);
        assertEquals(expResult, result);
        a = 8;
        b = 2;
        expResult = 10;
        result = instance.task5(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of task6 method, of class Ex4Driver.
     */
    @Test
    public void testTask6() {
        System.out.println("task6");
        String text = "Hello World";
        Integer n = 4;
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 'o';
        Character result = instance.task6(text, n);
        assertEquals(expResult, result);
        text = "Good Bye!";
        n = 5;
        expResult = 'B';
        result = instance.task6(text, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task7 method, of class Ex4Driver.
     */
    @Test
    public void testTask7() {
        System.out.println("task7");
        Integer[] array = new Integer[20];
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 20;
        Integer result = instance.task7(array);
        assertEquals(expResult, result);
        array = new Integer[7];
        expResult = 7;
        result = instance.task7(array);
        assertEquals(expResult, result);
    }

    /**
     * Test of task8 method, of class Ex4Driver.
     */
    @Test
    public void testTask8() {
        System.out.println("task8");
        Integer[] array = new Integer[20];
        Integer n = 10;
        Ex4Driver instance = new Ex4Driver();
        Boolean expResult = true;
        Boolean result = instance.task8(array, n);
        assertEquals(expResult, result);
        array = new Integer[25];
        n = 50;
        expResult = false;
        result = instance.task8(array, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task9 method, of class Ex4Driver.
     */
    @Test
    public void testTask9() {
        System.out.println("task9");
        ArrayList<String> array = new ArrayList();
        array.add("Bob");
        array.add("Sally");
        array.add("Joe");
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 3;
        Integer result = instance.task9(array);
        assertEquals(expResult, result);
        array.add("Susan");
        expResult = 4;
        result = instance.task9(array);
        assertEquals(expResult, result);
    }

    /**
     * Test of task10 method, of class Ex4Driver.
     */
    @Test
    public void testTask10() {
        System.out.println("task10");
        HashMap<Integer, Integer> hashbrown = new HashMap<>();
        hashbrown.put(100,20);
        hashbrown.put(30000,40);
        hashbrown.put(2,3);
        hashbrown.put(3,4);
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 4;
        Integer result = instance.task10(hashbrown);
        assertEquals(expResult, result);
        hashbrown.put(222,666);
        hashbrown.put(333,444);
        expResult = 6;
        result = instance.task10(hashbrown);
        assertEquals(expResult, result);
    } 
}
