package chapter07面向对象基础;

public class PopDetail {
    public static void main(String[] args) {
        /*
        1) 属性的定义语法同变量，示例：访问修饰符 属性类型 属性名;
这里老师简单的介绍访问修饰符： 控制属性的访问范围
有四种访问修饰符 public, proctected, 默认, private ,后面我会详细介绍
2) 属性的定义类型可以为任意类型，包含基本类型或引用类型
3) 属性如果不赋值，有默认值，规则和数组一致。具体说: int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，
boolean false，String null
         */
        //创建 Person 对象
//p1 是对象名(对象引用)
//new Person() 创建的对象空间(数据) 才是真正的对象
        Person p1 = new Person();
        p1.name = "小明";
        p1.age = 20;
        Person p2 = p1;
//对象的属性默认值，遵守数组规则:
//int 0，short 0, byte 0, long 0, float 0.0,double 0.0，char \u0000，boolean false，String null
        System.out.println("\n 当前这个人的信息");
        System.out.println("age=" + p1.age + " name=" + p1.name + " sal=" + p1.sal + " isPass=" + p1.isPass) ;
        System.out.println(p2.age);
        Person a = new Person();
        a.age=10;
        a.name="小明";
        Person b;
        b=a;
        System.out.println(b.name);//小明
        b.age=20;
        b=null;
        System.out.println(a.age);//10
//        System.out.println(b.age);//异常报错
    }
}
class Person{
    int age;
    String name;
    double sal;
    boolean isPass;
}