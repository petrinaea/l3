package lesson_7;

public class Tests {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before test");
    }

    @Test(1)
    public void test1(){
        System.out.println("Test 1");
    }

    @Test(4)
    public void test2(){
        System.out.println("Test 2");
    }

    @Test (7)
    @AfterSuite
    public void test3(){
        System.out.println("Test 3");
    }

    @Test (10)
    public void test4(){
        System.out.println("Test 4");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After test");
    }


}
