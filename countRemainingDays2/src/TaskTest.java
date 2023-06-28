import java.text.ParseException;

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
    void countToDeadLineDate() throws ParseException {
        Task Task1 = new Task("Taska","2023/06/22");
        assertEquals(1, Task1.countToDeadLineDate());
        Task Task2 = new Task("Taskb","2023/06/26");
        assertEquals(3, Task2.countToDeadLineDate());
        Task Task3 = new Task("Taskc","2023/06/30");
        assertEquals(7, Task3.countToDeadLineDate());
    }

    @org.junit.jupiter.api.Test
    void sum() {
    }
}