package 作业.chapter07面向对象基础;

public class HomeWork08 {
    int count = 9;
    public void count1(){
        count = 10;
        System.out.println("count1=" + count);
    }
    public void count2(){
        System.out.println("count2=" + count++);
    }
    public static void main(String[] args) {
        new HomeWork08().count1();
        HomeWork08 homeWork08 = new HomeWork08();
        homeWork08.count2();
        homeWork08.count2();
    }
}
