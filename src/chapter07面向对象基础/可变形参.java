package chapter07面向对象基础;

public class 可变形参 {
    public static void main(String[] args) {
        HspMethod hspMethod = new HspMethod();
        hspMethod.showScore("老王",10,20);
        hspMethod.showScore("老王",10,20,30);
        hspMethod.showScore("老王",10,20,30,40,50);
    }
}
class HspMethod{
    public void showScore(String name,int... score){
        int sum =0 ;
        for (int i = 0;i < score.length;i++){
            sum += score[i];
        }
        System.out.println("姓名：" + name + "\t" + "成绩：" + sum);
    }
}