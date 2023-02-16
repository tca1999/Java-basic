package chapter08面向对象中级.多态;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public void cry() {
        System.out.println("Cat cry() 小猫喵喵叫...");
    }

    public Cat() {
    }
}
