package 作业.chapter07面向对象基础;

public class HomeWork07 {
    public static void main(String[] args) {
        Dog dog = new Dog("小白","灰色",2);
        dog.show();
    }
}
class Dog{
    String name;
    String color;
    int age;
    public Dog(String name,String color,int age){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void show(){
        System.out.println("姓名：" + name+" " + "颜色：" + color+" " + "年龄： " + age);
    }
}