package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("BeforeClass - I am only called once!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In BeforeEach ...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Csaba"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In AfterEach...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("AfterClass ***** - I am only called once!");
    }
}