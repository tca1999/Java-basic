package 作业.chapter13常用类;

public class HomeWork05 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        Aniaml a = new Aniaml(s1);
        Aniaml b = new Aniaml(s1);
        System.out.println(a == b);//F
        System.out.println(a.equals(b));//F
        System.out.println(a.name == b.name);//T
        String s4 = new String("hspedu");
        String s5 = "hspedu";
        System.out.println(s1 == s4);//F
        System.out.println(s4 == s5);//F
        String t1 = "hello" + s1;
        String t2 = "hellohspedu";
        System.out.println(t1.intern() == t2);//T
    }
}
class Aniaml{
    String name;

    public Aniaml(String name) {
        this.name = name;
    }
}