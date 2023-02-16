package chapter12异常;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 课堂练习04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        while (true) {
            System.out.println("请输入一个整数：");
            try {
                i = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("输入错误请重新输入：");
            }
        }
        System.out.println(i);
    }
}
