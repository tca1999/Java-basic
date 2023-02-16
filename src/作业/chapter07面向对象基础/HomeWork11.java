package 作业.chapter07面向对象基础;

public class HomeWork11 {
    public static void main(String[] args) {
        System.out.println(method(method(10.0,20.0),100));
    }
    public static double method(double a, double b){
        return Math.max(a, b);
    }
}
