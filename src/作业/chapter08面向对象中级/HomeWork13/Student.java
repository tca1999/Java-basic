package 作业.chapter08面向对象中级.HomeWork13;

public class Student extends Person{
    private int stu_id;

    public Student(String name, int age, char gander, int stu_id) {
        super(name, age, gander);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我会好好学习！");
    }

    @Override
    public void play() {
        System.out.println(getName()+"爱玩足球！");
    }

    @Override
    public void showInfo() {
        System.out.println("学生的信息：");
        super.showInfo();
        System.out.println("学号："+stu_id);
        study();
        play();
    }
}
