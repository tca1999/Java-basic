package chapter07面向对象基础;


public class this关键字 {
    public static void main(String[] args) {
        Person4 person1 = new Person4("张三",20);
        Person4 person2 = new Person4("张三",20);
        System.out.println(person2.compareTo(person1));
    }
}
class Person4{
    String name;
    int age;
    public Person4(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person4 person4){
        return this.name.equals(person4.name) && this.age == person4.age;
    }
}