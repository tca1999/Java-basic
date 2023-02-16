package chapter08面向对象中级.多态.应用02多态参数;

public class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double month_money, double bonus) {
        super(name, month_money);
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println("管理员工！");
    }
    public double getAnnual(){
        return super.getAnnual()+bonus;
    }
}
