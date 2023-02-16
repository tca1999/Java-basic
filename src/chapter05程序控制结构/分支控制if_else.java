package chapter05程序控制结构;

import java.util.Scanner;

public class 分支控制if_else {
    public static void main(String[] args) {
//        单分支
        //编写一个程序,可以输入人的年龄,如果该同志的年龄大于 18 岁, //则输出 "你年龄大于 18,
        // 要对自己的行为负责,送入监狱"
//
//思路分析
//1. 接收输入的年龄, 应该定义一个 Scanner 对象
//2. 把年龄保存到一个变量 int age
//3. 使用 if 判断，输出对应信息
//应该定义一个 Scanner 对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
//把年龄保存到一个变量 int age
        int age = myScanner.nextInt();
//使用 if 判断，输出对应信息
        if(age > 18) {
            System.out.println("你年龄大于 18,要对自己的行为负责,送入监狱");
        }
        System.out.println("程序继续...");
//        双分支
        //编写一个程序,可以输入人的年龄,如果该同志的年龄大于 18 岁, //则输出 "你年龄大于 18,要对
//自己的行为负责, 送入监狱"。否则 ,输出"你的年龄不大这次放过你了."
//
//思路分析
//1. 接收输入的年龄, 应该定义一个 Scanner 对象
//2. 把年龄保存到一个变量 int age
//3. 使用 if-else 判断，输出对应信息
        //应该定义一个 Scanner 对象
        Scanner myScanner1 = new Scanner(System.in);
        System.out.println("请输入年龄");
//把年龄保存到一个变量 int age
        int age1 = myScanner1.nextInt();
//使用 if-else 判断，输出对应信息
        if(age1 > 18) {
            System.out.println("你年龄大于 18,要对自己的行为负责,送入监狱");
        } else {//双分支
            System.out.println("你的年龄不大这次放过你了");
        }
        System.out.println("程序继续...");
//        单分支与双分支课堂练习
//        第一题
        int x = 7;
        int y = 4;
        if (x>5){
            if (y>5){
            System.out.println(x+y);
            }
            System.out.println("韩顺平教育！");
        }else {
            System.out.println(x);
        }
//      第二题
        double d1=15;
        double d2=15;
        if(d1>10.0){
            if(d2<20.0){
                System.out.println("d1+d3="+(d1+d2));
            }
        }else {
            System.out.println("程序继续！");
        }
//        第三题
        int i1=2;
        int i2=5;
        if((i1+i2)%3==0 && (i1+i2)%5==0){
            System.out.println("能被3和5整除！");
        }else {
            System.out.println("不能被3和5整除！");
        }
//        第四题
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+"年是闰年！");
        }else {
            System.out.println(year+"年不是闰年！");
        }
//        多分枝课堂练习
//        第一题
        Scanner sc1=new Scanner(System.in);
        System.out.println("请输入信誉分：");
        int score=sc1.nextInt();
        if(score>100 || score <0){
            System.out.println("信用分输入有误，请重新输入：");
        }else {
            if(score==100){
                System.out.println("信用极好！");
            }else if(score>80 && score <=99){
                System.out.println("信用优秀！");
            }else if(score>=60 && score<=80){
                System.out.println("信用一般！");
            }else {
                System.out.println("信用不及格！");
            }
        }
//        第二题
        boolean b=true;
        if(b==false){
            System.out.println("a");
        }else if(b){
            System.out.println("b");
        }else if(!b){
            System.out.println("c");
        }else {
            System.out.println("d");
        }
        if(b=false){
            System.out.println("a");
        }else if(b){
            System.out.println("b");
        }else if(!b){
            System.out.println("c");
        }else {
            System.out.println("d");
        }
//        嵌套分支课堂练习
//        第一题
        Scanner sc2=new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score1=sc2.nextDouble();
        if(score1>10.0 || score1<0){
            System.out.println("输入成绩不正确，请重新输入！");
        }else {
            if(score1>8.0){
                System.out.println("恭喜，进入决赛，请输入性别，进行分组：");
                char gender = sc2.next().charAt(0);
                if(gender=='女'){
                    System.out.println("进入女子组！");
                }else {
                    System.out.println("进入男子组！");
                }
            }
        }
//        第二题
        Scanner sc3=new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc3.nextInt();
        System.out.println("请输入年龄：");
        int age2=sc3.nextInt();
        if(month>12 || month<0){
            System.out.println("输入的月份有误，请重新输入！");
        }else if(month>=4 && month <= 10){
            if(age2>=18 && age2<=60){
                System.out.println("旺季，票价为60,是成人票！");
            }else if(age2<18){
                System.out.println("旺季，票价为30，是儿童票！");
            }else{
                System.out.println("旺季，票价为20，是老年票！");
            }
        }else{
            if (age2>18 && age2<60){
                System.out.println("淡季，票价为40，是成人票！");
            }else {
                System.out.println("淡季，票价为20，是老年票和儿童票！");
            }
        }
    }
}
