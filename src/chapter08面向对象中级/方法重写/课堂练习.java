package chapter08面向对象中级.方法重写;

public class 课堂练习 {
    public static void main(String[] args) {
        Person person = new Person("老王",20);
        System.out.println(person.say());
        Student student = new Student("小明", 18, "100", 89);
        System.out.println(student.say());
    }
}
