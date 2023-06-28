import java.io.IOException;
import java.net.URISyntaxException;
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
    void isExpired() throws URISyntaxException, IOException, ParseException, InterruptedException {
        Task task1 = new Task("タスク1", "2023/06/20");
        assertTrue(task1.isExpired());
        Task task2 = new Task("タスク2", "2023/05/26");
        assertTrue(task2.isExpired());
        Task task3 = new Task("タスク3", "2023/12/26");
        assertFalse(task3.isExpired());
        Task task4 = new Task("タスク4", "2023/06/21");
        assertFalse(task4.isExpired());
    }

    @org.junit.jupiter.api.Test
    void countToDeadLineDate() throws ParseException {
        Task task1 = new Task("タスク1", "2023/06/24");
        assertEquals(3,task1.countToDeadLineDate());
    }

    @org.junit.jupiter.api.Test
    void sum() {
        int[] arr1 = {5,20,25};
        assertEquals(50, Task.sum(arr1));
        int[] arr2 = {0,10,15};
        assertEquals(25, Task.sum(arr2));
        int[] arr3 = {20,30,1};
        assertEquals(51, Task.sum(arr3));
    }
}