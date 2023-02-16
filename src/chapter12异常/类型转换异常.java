package chapter12异常;

public class 类型转换异常 {
    public static void main(String[] args) {
        A b = new B(); //向上转型
        B b2 = (B)b;//向下转型，这里是 OK
        C c2 = (C)b;//这里抛出 ClassCastException
    }
}
class A {}
class B extends A {}
class C extends A {}