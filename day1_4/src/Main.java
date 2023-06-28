import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//演習問題4
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat data = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        try {
            date = data.parse(args[0]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        Date d1 = calendar.getTime();
        System.out.println("計算前の日付");
        System.out.println(data.format(d1));



        int num1 = Integer.parseInt(args[1]);
        System.out.println("足す日付");
        System.out.printf("%d\n",num1);
        calendar.add(calendar.DATE,num1);
        //date = calendar.add(calendar.DATE,args[1]);

        //Date型の持つ日時を表示
        //System.out.println(date);
        Date d2 = calendar.getTime();
        System.out.println("計算後の日付");
        System.out.println(data.format(d2));

    }
}