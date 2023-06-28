//演習21
import java.text.ParseException;


// Shift を 2 回押して 'どこでも検索' ダイアログを開き、`show whitespaces` と入力して
// Enter キーを押します。これでコードに空白文字が表示されます。
public class Main {
    public static void main(String[] args) throws ParseException {
        // ハイライトされたテキストにキャレットがある状態で Alt+Enter を押して
        // IntelliJ IDEA が提案する修正方法を表示します。

        Task d = new Task("id1","2023/06/01");

        if(d.isExpired()){
            System.out.println("まだ期限内です。");
        }
        else{
            System.out.println("期限を過ぎました。");
        }
    }
}
