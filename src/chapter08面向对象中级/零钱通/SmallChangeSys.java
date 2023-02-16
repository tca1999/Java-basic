package chapter08面向对象中级.零钱通;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public double[] arr = {};
    String[] texts = {};

    public static void main(String[] args) {
        SmallChangeSys smallChangeSys = new SmallChangeSys();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------零钱通菜单----------");
        System.out.println("        1 零钱通明细");
        System.out.println("        2 收益入账");
        System.out.println("        3 消费");
        System.out.println("        4 退 出");
        op:
        while (true) {
            System.out.println("请选择（1-4）：");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    smallChangeSys.showDetail();
                    break;
                case 2:
                    smallChangeSys.showIn();
                    break;
                case 3:
                    smallChangeSys.spend();
                    break;
                case 4:
                    op1:
                    while (true) {
                        System.out.println("是否继续退出（y/n）：");
                        char ch = scanner.next().charAt(0);
                        if (ch == 'y') {
                            break op;
                        }else if (ch == 'n'){
                            break op1;
                        }
                    }
            }
        }
    }

    private void spend() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入消费金额：");
            double out = scanner.nextDouble();
            if (out == 1) {
                break;
            }
            System.out.println("请输入备注：");
            String text = scanner.next();
            String[] text1 = new String[texts.length + 1];
            double[] arr1 = new double[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
            }
            for (int i = 0; i < texts.length; i++) {
                text1[i] = texts[i];
            }
            text1[text1.length - 1] = text;
            arr1[arr1.length - 1] = out;
            texts = text1;
            arr = arr1;
        }
    }

    public void showIn() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入收益金额(-1退出)：");
            double[] arr1 = new double[arr.length + 1];
            double in = scanner.nextDouble();
            if (in == -1) {
                break;
            }
            if (in < 0){
                System.out.println("输入有误，请重新输入！");
                continue;
            }
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
            }
            arr1[arr1.length - 1] = in;
            arr = arr1;
        }
    }

    public void showDetail() {
        System.out.println("----------零钱通明细----------");
        int sum = 0;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        if (arr.length > 0) {
            for (int i = 0, j = 0; i < arr.length; i++) {
                sum += arr[i];
                if (arr[i] >= 0) {
                    System.out.println("收益入账：" + "+" + arr[i] + " " + simpleDateFormat.format(date) + " 余额：" + sum);
                } else {
                    System.out.println(texts[j] + " " + arr[i] + " " + simpleDateFormat.format(date) + " 余额：" + sum);
                    j++;
                }
            }
        } else {
            System.out.println();
        }

    }
}
