import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//演習20をベースにして、演習23を作成　まだ未完成
public class Task {
    String name;
    String deadLineDate;


    public Task(String name, String deadLineDate) {
        this.name = name;
        this.deadLineDate = deadLineDate;
    }
    public boolean isExpired() throws URISyntaxException, IOException, InterruptedException, ParseException{
        if(this.countToDeadLineDate() < 0) {
            return true;
        } else {
            return false;
        }
    }

    public int countToDeadLineDate() throws ParseException {
        Calendar todayC = Calendar.getInstance();
        if(todayC.getTime().after(DateUtil.validateAndParseDate(this.deadLineDate))) {
            return -1 * DateUtil.countWorkingDays(this.deadLineDate, DateUtil.toYYYYMMDD(todayC));
        } else {
            return DateUtil.countWorkingDays(DateUtil.toYYYYMMDD(todayC), this.deadLineDate);
        }
    }



    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
    public boolean countRemainingDays() throws ParseException {
        if (this.countToDeadLineDate() < 0) {
            return true;
        } else {
            return false;
        }
    }
    public int countToDeadLineDate() throws ParseException {
        public boolean countRemainingDays() throws ParseException {
            Calendar todayC = Calendar.getInstance();
            if (todayC.getTime().after(DateUtil.validateAndParseDate(this.deadLineDate))) {
                return -1 * DateUtil.countWorkingDays(this.deadLineDate, DateUtil.toYYYYMMDD(todayC));
            } else {
                return DateUtil.countWorkingDays(DateUtil.toYYYYMMDD(todayC), this.deadLineDate);
            }
        }
    }


}
