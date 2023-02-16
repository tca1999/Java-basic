package chapter08面向对象中级.多态.应用02多态参数;

public class Employee {
    private String name;
    private double month_money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonth_money() {
        return month_money;
    }

    public void setMonth_money(double month_money) {
        this.month_money = month_money;
    }

    public Employee(String name, double month_money) {
        this.name = name;
        this.month_money = month_money;
    }
    public double getAnnual(){
        return month_money*12;
    }
}
