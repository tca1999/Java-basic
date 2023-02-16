package chapter08面向对象中级.继承;

public class 入门案例 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "金蛟蛟大王";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(40);
        pupil.showInfo();
        Graduate graduate = new Graduate();
        graduate.name = "银鲛岛王";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(60);
        graduate.showInfo();
    }
}
