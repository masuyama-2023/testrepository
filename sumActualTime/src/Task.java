import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Calendar;
public class Task {
    String name;
    String deadLineDate;
    int actualTime;


    public Task(String name, String deadLineDate,int actualTime) {
        this.name = name;
        this.deadLineDate = deadLineDate;
        this.actualTime = 0;
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

    public int sumTime(int[] array){
        int actualTime1 = this.actualTime;
        for(int i = 0; i < array.length; i++) {
            actualTime1 = actualTime1 + array[i];
        }


        return actualTime1;
    }


}
