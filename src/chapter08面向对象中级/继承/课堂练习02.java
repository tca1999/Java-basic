package chapter08面向对象中级.继承;

public class 课堂练习02 {
    public static void main(String[] args) {
        C c = new C();
        /*
        我是 A 类
        我是 B 类的有参构造
        我是 c 类的有参构造
        我是 c 类的无参构造
         */
        System.out.println(c);
    }
}

class A {//A 类

    public A() {
        System.out.println("我是 A 类");
    }
}

class B extends A { //B 类,继承 A 类 //main 方法中： C c =new C(); 输出么内容? 3min
    public B() {
        System.out.println("我是 B 类的无参构造");
    }

    public B(String name) {
        System.out.println(name + "我是 B 类的有参构造");
    }
}

class C extends B { //C 类，继承 B 类
    public C() {
        this("hello");
        System.out.println("我是 c 类的无参构造");
    }

    public C(String name) {
        super("hahah");
        System.out.println("我是 c 类的有参构造");
    }
}