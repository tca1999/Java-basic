package chapter08面向对象中级.封装;

public class 课堂练习 {
    public static void main(String[] args) {
        Account account = new Account("老王", 21, "123456");
        System.out.println(account.info());
    }
}

class Account {
    private String name;
    private double money;
    private String pwd;

    public Account(String name, double money, String pwd) {
        setName(name);
        setMoney(money);
        setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("输入的名字有误，请重新输入！");
            this.name = null;
        }
    }

    public double getMoney() {
        if (money > 20) {
            return money;
        } else {
            System.out.println("余额不足20！");
            return -1;
        }
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("输入的密码长度不够！");
            this.pwd = null;
        }
    }

    public String info() {
        return "账户信息为：name=" + this.getName() + " money=" + this.getMoney() + " pwd=" + this.getPwd();
    }
}