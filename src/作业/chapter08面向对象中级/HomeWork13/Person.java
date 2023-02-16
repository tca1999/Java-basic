package 作业.chapter08面向对象中级.HomeWork13;

public class Person {
    private String name;
    private int age;
    private char gander;

    public Person(String name, int age, char gander) {
        this.name = name;
        this.age = age;
        this.gander = gander;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGander() {
        return gander;
    }

    public void setGander(char gander) {
        this.gander = gander;
    }
    public void showInfo(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("性别："+gander);
    }
    public void play(){
        System.out.println("游戏");
    }
}
