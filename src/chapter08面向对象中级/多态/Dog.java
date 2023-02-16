package chapter08面向对象中级.多态;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }
    public void cry() {
        System.out.println("Dog cry() 小狗汪汪叫...");
    }
}
