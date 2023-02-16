package chapter08面向对象中级.多态.应用02多态参数;

public class Emp extends Employee{

    public Emp(String name, double month_money) {
        super(name, month_money);
    }
    public void work(){
        System.out.println("正在工作！");
    }
    public double getAnnual(){
        return super.getAnnual();
    }
}
