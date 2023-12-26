package qaguru.vikindor;

import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("\n### @BeforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("### @AfterAll\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("\n###     @BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("###     @AfterEach\n");
    }

    @Test
    void firstTest() {
        System.out.println("###         First Test");
        Assertions.assertTrue(2 * 2 == 4);
    }

    @Test
    void secondTest() {
        System.out.println("###         Second Test");
        Assertions.assertTrue(2 + 2 == 4);
    }
}
