import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilTest {

    @org.junit.jupiter.api.Test
    void countDays() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        DateUtil DateUtil1 = new DateUtil();
        Date date1_1 = sdf.parse("2023/06/04");
        Date date1_2 = sdf.parse("2023/06/07");
        assertEquals(3, DateUtil1.countDays(date1_1,date1_2));
        Date date2_1 = sdf.parse("2023/06/07");
        Date date2_2 = sdf.parse("2023/06/07");
        assertEquals(0, DateUtil1.countDays(date2_1,date2_2));
        Date date3_1 = sdf.parse("2023/06/06");
        Date date3_2 = sdf.parse("2023/06/07");
        assertEquals(1, DateUtil1.countDays(date3_1,date3_2));
    }
}