package chapter05程序控制结构;

public class for循环控制 {
    public static void main(String[] args) {
//        for循环内的基本使用
        for (int i = 0;i<=10;i++){
            System.out.println("hello world!");
        }
//        for循环的课堂练习
//        第一题
        int count=0;
        int sum = 0;
        int i = 1;
        for (i=1;i<=100;i++){
            if(i%9==0){
                sum+=i;
                count++;
                System.out.println("9的倍数:"+i);
            }
        }
        System.out.println("个数为:"+count);
        System.out.println("总和为:"+sum);
//        第二题
        int n=9;
        for (int a=0;a<=n;a++){
            System.out.println(a+"+"+(n-a)+"="+n);
        }
    }
}
