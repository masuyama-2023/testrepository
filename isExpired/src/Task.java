import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Task {
    String name;
    String deadLineDate;


    public Task(String name, String deadLineDate) {
        this.name = name;
        this.deadLineDate = deadLineDate;
    }

    public boolean isExpired() throws ParseException {
        Calendar cl = Calendar.getInstance();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
        String str1 = sdf1.format(cl.getTime());
        if (sdf1.parse(this.deadLineDate).compareTo(sdf1.parse(str1)) < 0) {
            return false;
        } else {
            return true;
        }
    }
}
