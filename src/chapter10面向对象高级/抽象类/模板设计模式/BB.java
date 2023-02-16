package chapter10面向对象高级.抽象类.模板设计模式;

public class BB extends Template{
    public void job() {//这里也去，重写了 Template 的 job 方法
        long num = 0;
        for (long i = 1; i <= 10000000; i++) {
            num *= i;
        }
    }
}