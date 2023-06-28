import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
//演習23　おそらく完成してると思う。



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RemainDays {
    String name;
    String deadLineDate;
    int actualMinuteTime;


    public RemainDays(String name, String deadLineDate) {
        this.name = name;
        this.deadLineDate = deadLineDate;
        this.actualMinuteTime = 0;
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
        if (todayC.getTime().after(RemainDaysCount.validateAndParseDate(this.deadLineDate))) {
            return -1 * RemainDaysCount.countWorkingDays(this.deadLineDate, RemainDaysCount.toYYYYMMDD(todayC));
        } else {
            return RemainDaysCount.countWorkingDays(RemainDaysCount.toYYYYMMDD(todayC), this.deadLineDate);
        }

    }



    public static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

//    public boolean countRemainingDays() throws ParseException {
//        Calendar cl = Calendar.getInstance();
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
//        String str1 = sdf1.format(cl.getTime());
//        if (sdf1.parse(this.deadLineDate).compareTo(sdf1.parse(str1)) < 0) {
//            return false;
//        } else {
//            Date date1 = sdf1.parse(this.deadLineDate);
//            Date date2 = cl.getTime();
//            int remaindays = -1 * RemainDaysCount.countDaysBetween(date1, date2);
//            System.out.println("残りの日数は"+remaindays+"です。");
//            return true;
//        }
//    }
}
