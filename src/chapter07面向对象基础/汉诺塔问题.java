package chapter07面向对象基础;

public class 汉诺塔问题 {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(4,'A','B','C');
    }
}
class Tower{
    public void move(int num,char a,char b,char c){
        if (num == 1){
            System.out.println(a + "->" + c);
        }else {
            move(num - 1,a,c,b);
            System.out.println(a + "->" + c);
            move(num - 1,b,a,c);
        }
    }
}
