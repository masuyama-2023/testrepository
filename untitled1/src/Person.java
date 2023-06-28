//クラスとインスタンス　練習問題
public class Person {
    private static int number; //人数
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age,String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        number++;
    }
    public static int getNumber() {
        return number;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getGender() {
        return this.gender;
    }
}
