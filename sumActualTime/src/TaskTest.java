import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void isExpired() {
    }

    @org.junit.jupiter.api.Test
    void countToDeadLineDate() {
    }

    @org.junit.jupiter.api.Test
    void sum() {
    }

    @org.junit.jupiter.api.Test
    void sumTime() {
        Task Task1 = new Task("Taska","2023/06/28",5);
        int[] ints = new int[10];
        assertEquals(10, Task1.sumTime(ints));
    }
}