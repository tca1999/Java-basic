package 作业.chapter07面向对象基础;

public class HomeWork10 {
    public static void main(String[] args) {
        Demo demo1 = new Demo();
        Demo demo2 = demo1;
        demo2.m();
        System.out.println(demo1.i);
        System.out.println(demo2.i);
    }
}
class Demo{
    int i = 100;
    public void m(){
        int j = i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
    }
}