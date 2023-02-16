package 作业.chapter08面向对象中级.HomeWork13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, int age, char gander, int work_age) {
        super(name, age, gander);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我承诺，我会认真教课！");
    }

    @Override
    public void play() {
        System.out.println(getName()+"爱玩象棋");
    }

    @Override
    public void showInfo() {
        System.out.println("老师的信息：");
        super.showInfo();
        System.out.println("工龄："+work_age);
        teach();
        play();
    }
}
