package chapter10面向对象高级.抽象类.模板设计模式;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime(); //这里还是需要有良好的 OOP 基础，对多态
        BB bb = new BB();
        bb.calculateTime();
    }
}
