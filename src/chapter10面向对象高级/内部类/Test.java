package chapter10面向对象高级.内部类;

import chapter08面向对象中级.多态.案例1;

public class Test {
    public Test(){
        Inner inner = new Inner();
        inner.a = 10;
        Inner inner1 = new Inner();
        System.out.println(inner1.a);//5
    }
    class Inner{
        public int a = 5;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Inner inner =  test.new Inner();
        System.out.println(inner.a);//5
    }
}
