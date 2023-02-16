package chapter10面向对象高级.接口;

public class InterfaceDetail0 {
    public static void main(String[] args) {
        //new IA();
    }
}
//1.接口不能被实例化
//2.接口中所有的方法是 public 方法, 接口中抽象方法，可以不用 abstract 修饰
//3.一个普通类实现接口,就必须将该接口的所有方法都实现,可以使用 alt+enter 来解决
//4.抽象类去实现接口时，可以不实现接口的抽象方法
interface IA {
    void say();//修饰符 public protected 默认 private
    void hi();
}
class Cat implements IA{
    @Override
    public void say() {
    }
    @Override
    public void hi() {
    }
}
abstract class Tiger implements IA {
}