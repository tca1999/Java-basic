package chapter05程序控制结构;

import java.util.Scanner;

public class do_while循环控制 {
    public static void main(String[] args) {
//        do-while的基本使用
        int i = 1;
        do{
            System.out.println("hello world!"+i);
            i++;
        }while (i<=10);
//        do-while课堂练习
//        第一题
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }while (a<=100);
//        第二题
        int b = 1;
        do {
            b+=b;
            b++;
        }while (b<=100);
        System.out.println(b);
//        第三题
        int c = 1;
        do {
            if(c%5==0 && c%3!=0){
                System.out.println(c);
            }
            c++;
        }while (c<=200);
//        第四题
        Scanner sc=new Scanner(System.in);
        boolean b1=true;
        do {
            System.out.println("老韩问：还钱吗？y/n");
            char ch=sc.next().charAt(0);
            if (ch=='y'){
                System.out.println("还钱！");
                b1=false;
            }
        }while (b1);
    }
}
