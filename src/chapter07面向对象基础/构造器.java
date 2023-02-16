package chapter07面向对象基础;

public class 构造器 {
    public static void main(String[] args) {
        Person3 person1 = new Person3();
        Person3 person2 = new Person3("老王",20);
        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.name + " " + person2.age);
    }
}
class Person3{
    String name;
    int age;
    public Person3(){
        age = 18;
    }
    public Person3(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}