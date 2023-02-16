package chapter08面向对象中级.equals方法;

public class 重写 {
    public static void main(String[] args) {
        Person tom = new Person("tom", 12345);
        Person nancy = new Person("nancy", 123);
        System.out.println(tom.equals(nancy));

    }
}
class Person{
    private String name;
    private int pwd;

    public Person(String name, int pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Person){
            Person person = (Person) obj;
            return this.name.equals(person.name) && this.pwd == person.pwd;
        }
        return false;
    }
}