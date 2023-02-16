package 作业.chapter05程序控制语句;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n=sc.nextInt();
        if(n==0){
            System.out.println(n+"为0!");
        } else if (n>0) {
            System.out.println(n+"大于0!");
        }else if(n<0){
            System.out.println(n+"小于0!");
        }else {
            System.out.println("输入有误,请重新输入!");
        }
    }
}
