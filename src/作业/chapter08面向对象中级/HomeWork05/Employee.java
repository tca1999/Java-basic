package 作业.chapter08面向对象中级.HomeWork05;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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

    public void printTotalSal() {
        System.out.println("姓名：" + name + " 基本工资：" + salary);
    }
}

class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printTotalSal() {
        super.printTotalSal();
        System.out.println("全年工资："+(getSalary()*12));
    }
}
class Peasant extends Employee{
    public Peasant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printTotalSal() {
        super.printTotalSal();
        System.out.println("全年工资："+(getSalary()*12));
    }
}
class Teacher extends Employee{
    private int classDay;
    private double classSal;

    public Teacher(String name, double salary, int classDay, double classSal) {
        super(name, salary);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public void printTotalSal() {
        super.printTotalSal();
        System.out.println("全年工资："+(getSalary()*12+classSal*classSal));
    }
}
class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printTotalSal() {
        super.printTotalSal();
        System.out.println("全年工资："+(getSalary()*12+bonus));
    }
}
class Waiter extends Employee{
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printTotalSal() {
        super.printTotalSal();
        System.out.println("全年工资："+(getSalary()*12));
    }
}