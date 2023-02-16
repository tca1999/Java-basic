package 作业.chapter05程序控制语句;

import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
//        判断是否为闰年
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = sc.nextInt();
        if ((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+"是闰年!");
        }else {
            System.out.println(year+"不是润年!");
        }
    }
}
