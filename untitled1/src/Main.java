// Shift を 2 回押して 'どこでも検索' ダイアログを開き、`show whitespaces` と入力して
// Enter キーを押します。これでコードに空白文字が表示されます。
import java.util.*;
//演習2 まだできてない
public class Main {
    public static void main(String[] args) throws Exception {

        //System.out.println("hello world");

        Person p = new Person("太郎",20,"男");
        System.out.println(p.getName()+":"+p.getAge()+"歳"+" 性別:"+p.getGender());

        Person p2 = new Person("花子",22,"女");
        System.out.println(p2.getName()+":"+p2.getAge()+"歳"+" 性別:"+p2.getGender());

        Person p3 = new Person("次郎",18,"男");
        System.out.println(p3.getName()+":"+p3.getAge()+"歳"+" 性別:"+p3.getGender());

        Person p4 = new Person("三郎",15,"男");
        System.out.println(p4.getName()+":"+p4.getAge()+"歳"+" 性別:"+p4.getGender());

        System.out.println("登録した人数"+ Person.getNumber());



        //ダメな参照の仕方1　staticではないので、クラス名.メソッド名は指定できない
        //System.out.println(Person.getName());

        //ダメな参照の仕方2 エラーは出ないが、指定の仕方としてはおかしい。
        //太郎が複数人いるかのように判断されてしまうため、可読性が下がる。
        //System.out.println(p.getNumber());
    }
}
