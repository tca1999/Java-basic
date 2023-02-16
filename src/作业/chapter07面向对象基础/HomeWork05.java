package 作业.chapter07面向对象基础;

public class HomeWork05 {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.zhouchang());
        System.out.println(circle.size());
    }
}
class Circle{
    double r;
    public Circle(double r){
        this.r = r;
    }
    public double zhouchang(){
        return this.r * 2 * 3.14;
    }
    public double size(){
        return this.r * this.r * 3.14;
    }
}