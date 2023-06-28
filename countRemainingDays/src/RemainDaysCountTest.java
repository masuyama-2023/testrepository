import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RemainDaysCountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void countDaysBetween() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        RemainDaysCount RemainDaysCount1 = new RemainDaysCount();
        Date date1_1 = sdf.parse("2023/06/04");
        Date date1_2 = sdf.parse("2023/06/07");
        assertEquals(3, RemainDaysCount.countDaysBetween(date1_1,date1_2));
        Date date2_1 = sdf.parse("2023/06/07");
        Date date2_2 = sdf.parse("2023/06/07");
        assertEquals(0, RemainDaysCount.countDaysBetween(date2_1,date2_2));
        Date date3_1 = sdf.parse("2023/06/06");
        Date date3_2 = sdf.parse("2023/06/07");
        assertEquals(1, RemainDaysCount.countDaysBetween(date3_1,date3_2));
    }
}