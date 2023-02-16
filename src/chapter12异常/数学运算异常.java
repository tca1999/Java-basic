package chapter12异常;

public class 数学运算异常 {
    public static void main(String[] args) {
        String name = "韩顺平教育";
//将 String 转成 int
        int num = Integer.parseInt(name);//抛出 NumberFormatException
        System.out.println(num);//1234
    }
}
