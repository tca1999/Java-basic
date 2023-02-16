package 作业.chapter05程序控制语句;

public class HomeWork01 {
    public static void main(String[] args) {
        int totalMoney=100000;
        int count=0;
        while (true){
            if (totalMoney>50000){
                count++;
                totalMoney-=totalMoney*0.05;
            }else if (totalMoney>=1000){
                count++;
                totalMoney-=1000;
            }else {
                System.out.println("你的余额不足!");
                break;
            }
        }
        System.out.println("经过车站的个数为:"+count);
    }
}
