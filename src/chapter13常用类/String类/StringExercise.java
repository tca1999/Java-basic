package chapter13常用类.String类;

public class StringExercise {
    public static void main(String[] args) {
        System.out.println("第一题");
        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));//true
        System.out.println(a == b);//true
        System.out.println("第二题");
        String a1 = new String("abc");
        String b1= new String("abc");
        System.out.println(a1.equals(b1));//t
        System.out.println(a1 == b1);//f
        System.out.println("第三题");
        String a2 = "hsp";
        String b2 = new String("hsp");
        System.out.println(a2.equals(b2));//t
        System.out.println(a2 == b2);//f
        //intern()方法用来放回常量池的地址的字符串
        System.out.println(a2 == b2.intern());//t
        System.out.println(b2 == b2.intern());
        System.out.println("第四题");
        String s1 = "hspedu";
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");
        System.out.println(s2 == s3);//F
        System.out.println(s2 == s4);//T
        System.out.println(s2.equals(s3));//T
        System.out.println(s1 == s2);//F
        System.out.println("第五题");
        Person p1 = new Person();
        p1.name = "hspedu";
        Person p2 = new Person();
        p2.name = "hspedu";
        System.out.println(p1.name.equals(p2.name));//T
        System.out.println(p1.name == p2.name);//T
        System.out.println(p1.name == "hspedu");//T
        String s5 = new String("bcde");
        String s6 = new String("bcde");
        System.out.println(s5 == s6);//F
        System.out.println("第六题");
        //创建了两个对象
        String s7 = "hello";
        s7 = "haha";
    }
}
class Person{
    String name;
}