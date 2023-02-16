package 作业.chapter05程序控制语句;

public class HomeWork08 {
    public static void main(String[] args) {
        double sum1 = 0,sum2=0,sum=0;
        for (double i=1;i<=100;i++){
            if (i%2!=0){
                sum1+=(1/i);
            }else {
                sum2+=(1/i);
            }
        }
        System.out.println(sum=sum1-sum2);
    }
}
