package chapter05程序控制结构;

import java.util.Scanner;

public class switch分支结构 {
    public static void main(String[] args) {
//        switch的基本使用
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符（a-g）：");
        char c = sc.next().charAt(0);
        switch (c){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入有误，请重新输入！");
                break;
        }
//        switch课堂练习
//        第一题：大小写字符转换
        Scanner sc1=new Scanner(System.in);
        System.out.println("请输入一个字符（a-e）：");
        char c1=sc1.next().charAt(0);
        switch (c1){
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("other");
                break;
        }
        Scanner sc2=new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        double score = sc2.nextDouble();
        if(score<0 || score > 100){
            System.out.println("输入有误，请重新输入！");
        }else {
            switch ((int)(score/60)) {
                case 0:
                    System.out.println("不及格！");
                    break;
                case 1:
                    System.out.println("及格！");
                    break;
            }
        }
//        第三题:打印季节
        Scanner sc3= new Scanner(System.in);
        System.out.println("请输入月份(1-12)");
        int month = sc3.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季!");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季!");
                break;
            default:
                System.out.println("输入有误,请重新输入!");
                break;
        }
    }
}
