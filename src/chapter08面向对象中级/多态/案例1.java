package chapter08面向对象中级.多态;

public class 案例1 {
    public static void main(String[] args) {
        Dog dog = new Dog("小白");
        Cat cat = new Cat("小花");
        Fish fish = new Fish("鱼");
        Bone bone = new Bone("骨头");
        Master master = new Master("老王");
        master.feed(dog,bone);
        master.feed(cat,fish);
    }
}
