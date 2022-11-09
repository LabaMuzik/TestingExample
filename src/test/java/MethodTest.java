import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MethodTest {
    Main sut;

    @BeforeEach
    public void init() {
        System.out.println("test started...");
        sut = new Main();
    }

    @BeforeAll
    public static void started() {
        System.out.println("tests start");
    }

    @AfterAll
    public static void finished() {
        System.out.println("tests finish");
    }

    @AfterEach
    public void testFinished() {
        System.out.println("test is done");
    }

    @Test
    public void calculating() {
        int[] arr = {35, 49, 707, 976, 1024};
        int bookSize = 382;
        int result = sut.calculating(arr, bookSize);
        assertEquals(3, result);
    }

    @Test
    public void calculating1() {
        int[] arr = {38, 109, 311, 434};
        int bookSize = 288;
        int result = sut.calculating(arr, bookSize);
        assertEquals(2, result);
    }

    @Test
    public void calculating2() {
        int[] arr = {41, 153, 330, 547, 721, 731, 8568};
        int bookSize = 770;
        int result = sut.calculating(arr, bookSize);
        assertEquals(1, result);

    }

    @Test
    public void calculating3() {
        int[] arr = {117, 256, 444, 573};
        int bookSize = 1500;
        int result = sut.calculating(arr, bookSize);
        assertEquals(0, result);

    }

}