package chapter03变量;

public class VarDetail {
    public static void main(String[] args) {
//        变量必须先声明，后使用，即有顺序
        int a = 50;
        System.out.println(a);//50;
        a = 88;
        System.out.println(a);//88
//        a = "jack";不兼容的类型
//        变量在同一个作用域不能重名
//        int a = 77;错误
    }
}
class Dog{
    public static void main(String[] args) {
        int a = 66;//正确
//        System.out.println(a);
    }
}

