package chapter07面向对象基础;

public class ex01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name="小白";
        cat1.age=1;
        cat1.color="白色";
        cat1.weight=10.0;
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 2;
        cat2.color = "花色";
        cat2.weight = 11.0;
        System.out.println(cat1.name+cat1.age+cat1.color+cat1.weight);
        System.out.println(cat2.name+cat2.age+cat2.color+cat2.weight);
    }
}

class Cat{
    String name;
    int age;
    String color;
    double weight;
}
