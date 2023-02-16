package chapter06数组排序和查找;

import chapter03变量.加号的使用;

import java.util.Arrays;

public class 多维数组_二维数组 {
    public static void main(String[] args) {
//        快速入门
//        请用二维数组输出如下图形
//0 0 0 0 0 0
//0 0 1 0 0 0
//0 2 0 3 0 0
//0 0 0 0 0 0
        int[][] arr={{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
//        动态初始化数组-列数不确定
//       创建一个二维数组
        int[][] arr1=new int[3][];
        for (int i=0;i<arr1.length;i++){
//            给每一个一位数组开空间
            arr1[i]=new int[i+1];
//            给每一个一维数组赋值
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=i+1;
            }
        }
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
//        课堂练习
        int sum=0;
        int[][] a={{4,6},{1,4,5,7},{-2}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
//        打印杨辉三角
        int[][] b=new int[10][];
        for (int i=0;i<b.length;i++){
            b[i]=new int[i+1];
            for (int j=0;j<b[i].length;j++){
                if (j==0 || j==i){
                    b[i][j]=1;
                }else {
                    b[i][j]=b[i-1][j]+b[i-1][j-1];
                }
            }
        }
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
