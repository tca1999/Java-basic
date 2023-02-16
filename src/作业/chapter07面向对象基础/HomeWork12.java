package 作业.chapter07面向对象基础;

public class HomeWork12 {
    public static void main(String[] args) {

    }
}
class Employee{
    String name;
    char sex;
    int age;
    String career;
    double salary;

    public Employee(String name, char sex, int age, String career, double salary) {
        this(name, sex, age);
        this.career = career;
        this.salary = salary;
    }

    public Employee(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(String career, double salary) {
        this.career = career;
        this.salary = salary;
    }
}