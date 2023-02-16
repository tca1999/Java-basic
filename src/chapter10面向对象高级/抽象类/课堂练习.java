package chapter10面向对象高级.抽象类;

import chapter08面向对象中级.多态.Master;

public class 课堂练习 {
    public static void main(String[] args) {
        Manager tom = new Manager("tom", "123", 10000,5000);
        tom.work();
    }
}
abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract void work();
}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理 " + getName() + "正在工作中......");
    }
}
class CommonEmployee extends Employee{

    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("工人 " + getName() + "正在工作中......");
    }
}