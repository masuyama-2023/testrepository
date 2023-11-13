import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;


class TaskTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void isExpired() throws URISyntaxException, IOException, ParseException, InterruptedException {
//        Task task1 = new Task("タスク1", "2023/06/20");
//        assertTrue(task1.isExpired());
//        Task task2 = new Task("タスク2", "2023/05/26");
//        assertTrue(task2.isExpired());
//        Task task3 = new Task("タスク3", "2023/12/26");
//        assertFalse(task3.isExpired());
//        Task task4 = new Task("タスク4", "2023/06/21");
//        assertFalse(task4.isExpired());
    }

    @org.junit.jupiter.api.Test
    void countToDeadLineDate() throws ParseException {
//        Task task1 = new Task("タスク1", "2023/06/24");
//        assertEquals(3,task1.countToDeadLineDate());
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

    @org.junit.jupiter.api.Test
    void sumTime() {
//        Task Task1 = new Task("Taska","2023/06/28",5);
//        int[] ints = new int[10];
//        assertEquals(10, Task1.sumTime(ints));


    }

    @Test
    void onDeadLine() {
    }

    @Test
    void testSumTime() {
//        Task task1 = new Task("タスク1", "2023/05/26");
//        task1.actualTime = 30;
//        Task task2 = new Task("タスク2", "2023/05/29");
//        task2.actualTime = 20;
//        Task task3 = new Task("タスク3", "2023/05/31");
//        task3.actualTime = 10;

        Task task1 = new Task("タスク1", "2023/07/26",30);
        task1.actualTime = 30;
        Task task2 = new Task("タスク2", "2023/07/29",20);
        task2.actualTime = 20;
        Task task3 = new Task("タスク3", "2023/07/31",10);
        task3.actualTime = 10;
        Task[] tasks1 = {task1, task2, task3};
        assertEquals(60, Task.SumTime(tasks1));
        Task[] tasks2 = {task1, task2};
        assertEquals(50, Task.SumTime(tasks2));
        Task[] tasks3 = {};
        assertEquals(0, Task.SumTime(tasks3));


//        Task[] tasks1 = {task1, task2, task3};
//        assertEquals(60, Task.sumTime(tasks1));
//        Task[] tasks2 = {task1, task2};
//        assertEquals(50, Task.sumTime(tasks2));
//        Task[] tasks3 = {};
//        assertEquals(0, Task.sumTime(tasks3));

    }
}