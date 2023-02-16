package chapter05程序控制结构;

public class return_跳转控制语句 {
    public static void main(String[] args) {
//        return的基本使用(退出整个程序)
        for (int i=1;i<=5;i++){
            if (i==3){
                System.out.println("hello world!"+i);
                return;
            }
            System.out.println("HELLO WORLD!");
        }
        System.out.println("go on...");
    }
}
