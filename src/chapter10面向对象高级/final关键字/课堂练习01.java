package chapter10面向对象高级.final关键字;

public class 课堂练习01 {
    public static void main(String[] args) {
        new Circle(3).print();
    }
}
class Circle{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
//        PI = 3.14;
    }

    private final double PI = 3.14;
    public void print(){
        System.out.println(PI * radius);
    }
    {
//        PI = 3.14;
    }
}