package chapter10面向对象高级.抽象类;

public class Abstract01 {
}
abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
//思考：这里 eat 这里你实现了，其实没有什么意义
//即： 父类方法不确定性的问题
//===> 考虑将该方法设计为抽象(abstract)方法
//===> 所谓抽象方法就是没有实现的方法
//===> 所谓没有实现就是指，没有方法体
//===> 当一个类中存在抽象方法时，需要将该类声明为 abstract 类
//===> 一般来说，抽象类会被继承，有其子类来实现抽象方法. // public void eat() {
// System.out.println("这是一个动物，但是不知道吃什么..");
// }
public abstract void eat() ;
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }
}