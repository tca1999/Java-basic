package 作业.chapter06数组排序和查找;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        int[] arr={10,12,45,90,95};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a=sc.nextInt();
        int[] arr1=new int[arr.length+1];
        int index=0;//记录数组中比a大的的一个数的位置
        for (int i=0;i<arr.length;i++){//遍历arr数组找出比a大的数的位置
            if (arr[i]>a){
                index=i;//将索引位置赋给index
                break;//跳出循环
            }else {
                index=i+1;
            }
        }
        for (int i=0,j=0;i<arr1.length;i++){//遍历arr1数组
            if (i!=index){//将arr数组复制到arr1数组中，并且跳过index位置
                arr1[i]=arr[j];
                j++;
            }else {
                arr1[i]=a;
            }
        }
        arr=arr1;
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
