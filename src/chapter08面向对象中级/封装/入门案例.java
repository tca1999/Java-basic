package chapter08面向对象中级.封装;

public class 入门案例 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("老王");
        person.setAge(20);
        person.setSalary(4999);
        System.out.println(person.info());
    }
}

class Person {
    public String name;// 名字公开化
    private int age;//私有化
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，请重新输入！");
            this.name = null;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 20) {
            this.age = age;
        } else {
            System.out.println("设置的年龄不对，请重新设置！");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为：name=" + name + " age=" + age + " salary=" + salary;
    }
}