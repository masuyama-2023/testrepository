import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @org.junit.jupiter.api.Test
    void countRemainingDays() throws ParseException {
        //Task1は今日の日付を入れる。Task2は今日の次の日付を入れる。
        Task Task1 = new Task("Taska","2023/06/12");
        assertEquals(true, Task1.countRemainingDays());
        Task Task2 = new Task("Taskb","2023/06/13");
        assertEquals(true, Task2.countRemainingDays());
        Task Task3 = new Task("Taskc","2023/06/30");
        assertEquals(true, Task3.countRemainingDays());
        Task Task4 = new Task("Taskd","2023/06/01");
        assertEquals(false, Task4.countRemainingDays());
    }
}