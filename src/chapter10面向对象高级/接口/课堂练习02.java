package chapter10面向对象高级.接口;

public class 课堂练习02 {
    public static void main(String[] args) {
        new C1().px();
    }
}
interface A1{
    int x = 0;
}
class B1{
    int x = 1;
}
class C1 extends B1 implements A1{
    public void px(){
        System.out.println(super.x);
        System.out.println(A1.x);
    }
}