package 作业.chapter05程序控制语句;

public class HomeWork09 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i<=100;i++){//控制相加个数
            for (int j = 1;j<=i;j++){//控制括号内相加个数
                sum+=j;
            }
        }
        System.out.println(sum);
    }
}
