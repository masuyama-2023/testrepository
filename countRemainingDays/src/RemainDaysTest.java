import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class RemainDaysTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void countToDeadLineDate() throws ParseException {
        //RemainDays1は今日の日付を入れる。RemainDays2は今日の次の日付を入れる。
        RemainDays RemainDays1 = new RemainDays("RemainDaysa","2023/06/22");
        assertEquals(1, RemainDays1.countToDeadLineDate());
        RemainDays RemainDays2 = new RemainDays("RemainDaysb","2023/06/26");
        assertEquals(3, RemainDays2.countToDeadLineDate());
        RemainDays RemainDays3 = new RemainDays("RemainDaysc","2023/06/30");
        assertEquals(7, RemainDays3.countToDeadLineDate());

    }
}