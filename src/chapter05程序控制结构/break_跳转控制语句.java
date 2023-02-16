package chapter05程序控制结构;

import java.util.Scanner;

public class break_跳转控制语句 {
    public static void main(String[] args) {
//        break的基本使用
        int count=0;
        while (true){
            int a = (int)(Math.random()*100+1);
            if (a==97){
                break;
            }else {
                count++;
            }
        }
        System.out.println(count);
//        注意事项和细节
        lable1:
        for (int i = 0;i<4;i++){
            lable2:
                    for (int j = 0;j<10;j++){
                        if (j==2){
                            break lable1;
                        }
                        System.out.println(j);
                    }
        }
//        break课堂练习
//        第一题：1-100 以内的数求和，求出 当和 第一次大于 20 的当前数 【for + break】
        int sum = 0;
        for(int i = 1;i<=100;i++){
            sum+=i;
            if (sum>20){
                System.out.println(i);
                break;
            }
        }
//        第二题：实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"
//        提示登录成功，否则提示还有几次机会，请使用 for+break完成
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("请输入姓名：");
            String name=sc.next();
            System.out.println("请输入密码：");
            int pwd=sc.nextInt();
            if ("丁真".equals(name) && pwd==666){
                System.out.println("登录成功！");
                break;
            }
            System.out.println("你还有"+(2-i)+"次机会！");

        }
    }
}
