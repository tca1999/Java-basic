package chapter07面向对象基础;

public class 递归_课堂练习 {
    public static void main(String[] args) {
        Test test = new Test();
        int a1=test.a(7);
        System.out.println(a1);
        int b1 = test.b(1);
        System.out.println(b1);
    }
}
class Test{
//    斐波拉
    public int a(int n){
        if (n == 1 || n == 2){
            return 1;
        }else {
            return a(n-1)+a(n-2);
        }
    }
//    猴子吃桃问题
    public int b(int day){
        if (day == 10){
            return 1;
        }else{
            return (b(day+1)+1)*2;
        }
    }
}