package chapter11枚举和注解;

public class 课堂练习01 {
    public static void main(String[] args) {
        Gender boy = Gender.BOY;
        Gender boy2 = Gender.BOY;
        System.out.println(boy);
        System.out.println(boy == boy2);
    }

}
enum Gender{ //1min
    BOY , GIRL; //这里其实就是调用 Gender 类的无参构造器
}
