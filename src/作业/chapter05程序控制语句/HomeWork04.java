package 作业.chapter05程序控制语句;


import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
//        判断水仙花数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int n = sc.nextInt();
        int ge = n%10;
        int shi = n/10%10;
        int bai = n/100;
        if (ge*ge*ge+shi*shi*shi+bai*bai*bai==n){
            System.out.println(n+"是水仙花数!");
        }else {
            System.out.println(n+"不是水仙花数!" );
        }
    }
}
