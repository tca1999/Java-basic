package chapter09房屋出租系统.utils;

public class Test {
    public static void main(String[] args) {
//        String s = Utility.readString(3);
//        System.out.println(s);
        String string = Utility.readString(10, "hello world");
        System.out.println(string);
    }
}