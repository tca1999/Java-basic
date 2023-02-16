package chapter11枚举和注解;

public class enum关键字 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SPRING);
    }
}
enum Season2{
    //定义了四个对象, 固定.
//    public static final Season SPRING = new Season("春天", "温暖");
//    public static final Season WINTER = new Season("冬天", "寒冷");
//    public static final Season AUTUMN = new Season("秋天", "凉爽");
//    public static final Season SUMMER = new Season("夏天", "炎热");
    //如果使用了 enum 来实现枚举类
//1. 使用关键字 enum 替代 class
//2. public static final Season SPRING = new Season("春天", "温暖") 直接使用
// SPRING("春天", "温暖") 解读 常量名(实参列表)
//3. 如果有多个常量(对象)， 使用 ,号间隔即可
//4. 如果使用 enum 来实现枚举，要求将定义常量对象，写在前面
//5. 如果我们使用的是无参构造器，创建常量对象，则可以省略 ()
    SPRING("春天", "温暖"), WINTER("冬天", "寒冷"), AUTUMN("秋天", "凉爽"), SUMMER("夏天", "炎热");/*, What()*/
    private String name;
    private String desc;

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }


}