package chapter12异常;

public class 空指针异常 {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
    }
}
