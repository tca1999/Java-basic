package chapter08面向对象中级.方法重写;

public class Student extends Person {
    private String id;
    private double score;

    public Student(String name,int age,String id, double score) {
        super(name,age);
        this.id = id;
        this.score = score;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return "id=" + id + " name=" + getName() + " age=" + getAge() + " score=" + score;
    }
}
