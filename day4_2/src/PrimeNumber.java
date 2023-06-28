// Shift を 2 回押して 'どこでも検索' ダイアログを開き、`show whitespaces` と入力して
// Enter キーを押します。これでコードに空白文字が表示されます。
//演習問題5
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        int record = 2;
        int count = 1;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        for (int i = 1; i <= target; i++) {
            // 2~入力値未満の間で割り切れてしまえば素数ではない判定
            if (i == 1) {
                System.out.printf("%d;%d\n", i, record);

            } else {
                while (true){
                    record += 1;
                    //for (int num1 = 2; num1 < record; num1++) {
                        for (int ii = 2; ii < record; ii++) {
                            if (record % ii == 0) {
                                break;
                            }
                        }

                    System.out.printf("%d;%d\n", i, record);
                        if(i == target){
                            break;
                        }

                    //}
                }

            }
        }
    }
}




