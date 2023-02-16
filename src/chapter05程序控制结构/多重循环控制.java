package chapter05程序控制结构;

import java.util.Scanner;

public class 多重循环控制 {
    public static void main(String[] args) {
//        多重循环的基本使用
        for(int i= 0;i<3;i++){
            for (int j = 0;j<3;j++){
                System.out.println("i="+i+"j="+j);
            }
        }
//        多重循环的课堂练习
//        第一题
        Scanner sc=new Scanner(System.in);
        int score=0;
        int sum=0;
        int count = 0;//每个班级的人数
        int sum1=0;//每个班级的成绩
        int count1=0;//每个班级的及格人数
//        班级循环
        for (int i=0;i<3;i++){
            System.out.println("班级"+i);
            sum1=0;
            count1=0;
//            学生循环
            for (int j = 0;j<5;j++){
                System.out.println("请输入如学生成绩：");
//                score=sc.nextInt();
                sum+=score;
                count++;
                if(count<=5){
                    sum1+=score;
                } else if (count<=10) {
                    sum1+=score;
                } else if (count<=15) {
                    sum1+=score;
                }
//                第二题
                if (score>=60){
                    count1++;
                }
            }
            System.out.println("班级"+i+"的平均分为："+(sum1/5));
            System.out.println("班级"+i+"的及格人数为："+count1);
        }
        System.out.println("所有学生的平均分为："+(sum/15));
//        第三题：九九乘法表
        for(int i = 1;i<=9;i++){
            for(int j = 1;j<=i;j++){
                    System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
//        第四题：经典金字塔问题

        int totalLevel=11;
        for(int i=1 ;i<=totalLevel;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        金字塔居中效果
        for(int i=1 ;i<=totalLevel;i++){
            for (int n= totalLevel-i;n>0;n--){
                System.out.print(' ');
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        打印空心金字塔
        for(int i=1 ;i<=totalLevel;i++){
            for (int n=1;n<=totalLevel-i;n++){
                System.out.print(' ');
            }
            for (int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1 || i==totalLevel){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        打印空心菱形
        for(int i = 1;i<=totalLevel;i++){
            for (int n=1;n<=totalLevel-i;n++){
                System.out.print(' ');
            }
            for(int j = 1;j<=2*i-1;j++){
                if(i<=6){
                    if(j==1 || j==2*i-1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }else {
                    if(j==11){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
