package chapter05程序控制结构;

public class while循环控制 {
    public static void main(String[] args) {
//        while循环的基本使用
        int i=1;
        while (i<=10){
            System.out.println("hello world!"+i);
            i++;
        }
//        while循环的课堂练习
//        第一题
        int a=1;
        while (a<=100){
            if(a%3==0){
                System.out.println(a);
            }
            a++;
        }
//        第二题
        int b = 40;
        int count = 0;
        while (b<=200){
            if(b%2==0){
                System.out.println(b);
                count++;
            }
            b++;
        }
        System.out.println(count);
    }
}
