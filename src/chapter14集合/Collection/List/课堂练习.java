package chapter14集合.Collection.List;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class 课堂练习 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("tom",3));
        dogs.add(new Dog("nancy",4));
        dogs.add(new Dog("smith",4));
        Iterator<Dog> iterator = dogs.iterator();
        System.out.println("迭代器遍历");
        while (iterator.hasNext()) {
            Dog next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("增强for循环");
        for (Object o : dogs) {
            System.out.println(o);
        }

    }
}
class Dog{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}