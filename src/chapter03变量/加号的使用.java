package chapter03变量;

public class 加号的使用 {
    public static void main(String[] args) {
//        当左右两边都是数值类型，则做加法运算
        System.out.println(100 + 3);
//        当左右两边有一方是字符串，则做拼接运算
        System.out.println("100" + 3);
//        运算顺序，从左到右
        System.out.println(100 + 3 + "hello");
        System.out.println("hello" + 100 + 3);
    }
}
