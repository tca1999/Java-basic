package 作业.chapter08面向对象中级;

public class HomeWork11 {
    public static void main(String[] args) {
        Person1 person =new Student();
        person.eat();
        person.run();
        Student student = (Student) person;
        student.run();
        student.eat();
        student.study();
    }
}
class Person1{
    public void run(){
        System.out.println("person1 run");
    }
    public void eat(){
        System.out.println("person1 eat");
    }
}
class Student extends Person1{
    @Override
    public void run() {
        System.out.println("student run");
    }
    public void study(){
        System.out.println("student study");
    }
}