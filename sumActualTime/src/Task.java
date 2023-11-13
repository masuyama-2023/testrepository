import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
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
    public boolean onDeadLine() throws URISyntaxException, IOException, InterruptedException, ParseException{
        if(this.countToDeadLineDate() == 0) {
            return true;
        }
        else{
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
        for (int j : array) {
            sum = sum + j;
        }
        return sum;
    }

    private int getActualMinuteTime() {
        return this.actualTime;
    }

//    public int sumTime(Task[] array){
//        int actualTime1 = this.actualTime;
//        for(int i = 0; i < array.length; i++) {
//            actualTime1 = actualTime1 + array[i];
//        }
//
//
//        return actualTime1;
//    }
//public static int getTotalActualTime(Task[] tasks) {
//    //convert Task[] to int[]
//    int[] actualMinuteTimeArray = new int[tasks.length];
//    for(int i = 0; i < tasks.length; i++) {
//        actualMinuteTimeArray[i] = tasks[i].getActualMinuteTime();
//    }
//    return sum(actualMinuteTimeArray);
//}
    public static int SumTime(Task[] tasks) {
        //convert Task[] to int[]
        int[] actualMinuteTimeArray = new int[tasks.length];
        for(int i = 0; i < tasks.length; i++) {
            actualMinuteTimeArray[i] = tasks[i].getActualMinuteTime();
        }
        return sum(actualMinuteTimeArray);
    }

//    public static int sumTime(Task[] array){
        //array[0].actualTime

//        Task task1 = new Task(task1,"2023/07/26",30);
//        Task task2 = new Task(task2,"2023/07/30",40);
//
//        Task[] tasks = [task1.actualTime,task2.actualTime];
//
//        //[task1　画面作成30分,　　　task2 データベース連携40分]というarrayから
//        //[30,40]の配列を作成
//        //問題25から70と計算できる
//
//        return sum(Tasks);


//        return Arrays
//                .stream(array)
//                .mapToInt(Task::getActualMinuteTime)
//                .sum();



}
