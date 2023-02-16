package 作业.chapter10面向对象高级;

public class HomeWork05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}
class A{
    private String name = "张三";
    public void f1(){
        class B{
            private String name = "李四";
            public void show(){
                System.out.println(name + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }

}