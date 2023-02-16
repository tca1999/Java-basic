package chapter11枚举和注解;

public class 课堂练习02 {
    public static void main(String[] args) {
        Week[] week = Week.values();
        for (Week day:week) {
            System.out.println(day);
        }
    }
}
enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");
    private String desc;

    Week(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return  desc;
    }
}