package nika;

import org.junit.*;

import static org.junit.Assert.*;

public class MyMathTest {
    MyMath m = new MyMath();

    @Before
    public void before(){
        System.out.println("Before");
    }
    @After
    public void after(){
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class\n");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("\nAfter class");
    }

    @Test
    public void sum_with3nums(){
        System.out.println("Test 1");
        int result = m.sum(new int[]{1 ,2 ,3});
        assertEquals(6, result);
    }

    @Test
    public void sum_with1num(){
        System.out.println("Test 2");
        int result = m.sum(new int[]{3});
        assertEquals(3, result);
        //fail("rgaca");
    }

    @Test
    public void isOdd_with4(){
        System.out.println("Test 3");
        assertTrue(m.isEven(4));
    }

    @Test
    public void isOdd_with5(){
        System.out.println("Test 4");
        assertFalse(m.isEven(5));
    }
}