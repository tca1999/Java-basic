package chapter10面向对象高级.类变量和类方法;
/*
1) 在 main()方法中，我们可以直接调用 main 方法所在类的静态方法或静态属性。
2) 但是，不能直接访问该类中的非静态成员，必须创建该类的一个实例对象后，才能通过这个对象去访问类中的非静
态成员，
 */
public class Main01 {
    //静态的变量/属性
    private static String name = "韩顺平教育";
    //非静态的变量/属性
    private int n1 = 10000;
    //静态方法
    public static void hi() {
        System.out.println("Main01 的 hi 方法");
    }
    //非静态方法
    public void cry() {
        System.out.println("Main01 的 cry 方法");
    }
    public static void main(String[] args) {
//可以直接使用 name
//1. 静态方法 main 可以访问本类的静态成员
        System.out.println("name=" + name);
        hi();
//2. 静态方法 main 不可以访问本类的非静态成员
//System.out.println("n1=" + n1);//错误
//cry();
//3. 静态方法 main 要访问本类的非静态成员，需要先创建对象 , 再调用即可
        Main01 main01 = new Main01();
        System.out.println(main01.n1);//ok
        main01.cry();
    }
}
