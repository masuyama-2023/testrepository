import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class DateCountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isWeekDay() {
    }

    @Test
    void isSaturdayOrSunday() {
    }

    @Test
    void countWorkingDays() {
    }

    @Test
    void getDaysStrBetween() {
    }

    @Test
    void getNextWorkingDayOf() throws ParseException {
        //5月31日を指定したら、6月1日が返ってくる
        //6月2日を指定したら、6月5日が返ってくる
        assertEquals("2023/06/01", DateCount.getNextWorkingDayOf("2023/05/31"));
        assertEquals("2023/06/05", DateCount.getNextWorkingDayOf("2023/06/02"));
        assertEquals("2023/05/30", DateCount.getNextWorkingDayOf("2023/05/29"));
        //異常ケースの文↓
        //assertEquals("2023/05/31", DateCount.getNextWorkingDayOf("2023/05/29"));


    }


    @Test
    void countDaysBetween() {


    }
}