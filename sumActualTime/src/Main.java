//演習26
import java.util.ArrayList;
import java.util.Arrays;

// Shift を 2 回押して 'どこでも検索' ダイアログを開き、`show whitespaces` と入力して
// Enter キーを押します。これでコードに空白文字が表示されます。
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 4));
        ArrayList<Integer> arr3 = getUnionOf(arr1, arr2);
        System.out.println(arr3);
        ArrayList<String> arr4 = new ArrayList<>(Arrays.asList("あ", "い"));
        ArrayList<String> arr5 = new ArrayList<>(Arrays.asList("い", "え", "お"));
        ArrayList<String> arr6 = getUnionOf(arr4, arr5);
        System.out.println(arr6);
        ArrayList<String> arr7 = new ArrayList<>(Arrays.asList("あいう", "やゆよ", "わをん"));
        ArrayList<String> arr8 = new ArrayList<>(Arrays.asList("い", "え", "お"));
        ArrayList<String> arr9 = getUnionOf(arr7, arr8);
        System.out.println(arr9);



    }

    public static <T> ArrayList<T> getUnionOf(ArrayList<T> ints1, ArrayList<T> ints2) {
        ArrayList<T> union = new ArrayList<T>();
        for (int i = 0; i < ints1.size(); i++) {
            union.add(ints1.get(i));
        }
        for (int i = 0; i < ints2.size(); i++) {
            union.add(ints2.get(i));
        }
        return union;
    }


}