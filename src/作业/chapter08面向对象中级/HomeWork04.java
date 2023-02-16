package 作业.chapter08面向对象中级;

public class HomeWork04 {
    public static void main(String[] args) {
        Worker worker = new Worker("普通工人", 50, 30);
        worker.showSalary();
        Manager manager = new Manager("经理", 50, 30);
        manager.showSalary();
    }
}
class Employee{
    private String name;
    private double salary;
    private int day;

    public Employee(String name, double salary, int day) {
        this.name = name;
        this.salary = salary;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void showSalary(){
        System.out.println("姓名："+name+" 每日工资："+salary+" 工作天数："+day);
    }
}
class Manager extends Employee{

    public Manager(String name, double salary, int day) {
        super(name, salary, day);
    }

    @Override
    public void showSalary() {
        super.showSalary();
        System.out.println("总工资"+(getSalary()*getDay()*1.2));
    }
}
class Worker extends Employee{

    public Worker(String name, double salary, int day) {
        super(name, salary, day);

    }

    @Override
    public void showSalary() {
        super.showSalary();
        System.out.println("总工资"+(getSalary()*getDay()*1.0));
    }
}