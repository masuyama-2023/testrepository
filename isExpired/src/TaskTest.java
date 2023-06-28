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
    //タスクaは今日の日付、bは過ぎた日付、cはまだ過ぎてない日付を入れる
    void isExpired() throws ParseException {
        Task task1 = new Task("taska","2023/06/07");
        assertEquals(true, task1.isExpired());
        Task task2 = new Task("taskb","2023/06/01");
        assertEquals(false, task2.isExpired());
        Task task3 = new Task("taskc","2023/06/11");
        assertEquals(true, task3.isExpired());
    }
}