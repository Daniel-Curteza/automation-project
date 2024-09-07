package testNG;

import courses.calculator.Calculator;
import org.testng.annotations.*;

@Test
public class MyFirstNGTest {
    int count = 0;
    Calculator calculator;

    @BeforeTest
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Set up before each test run");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Set up before class");
    }

    public void test1 (){
        System.out.println("This is test1");
    }

    @Test
    public void test2 (){
        System.out.println("This is test2");
    }

    @Test(invocationCount = 10, threadPoolSize = 1)
    public void  testIncrement()throws InterruptedException{
        count++;
        Thread.sleep(2000);
        System.out.println("Current value for count is:" + count);
    }
    @AfterTest
    public void cleanUp() {
        System.out.println("Clean up after each test run");
    }

    @AfterClass
    public static void cleanAfterClass() {
        System.out.println("Clean up after class run");
    }
}

