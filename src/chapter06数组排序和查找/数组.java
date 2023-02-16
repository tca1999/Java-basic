package chapter06数组排序和查找;

import java.util.Scanner;

public class 数组 {
    public static void main(String[] args) {
//        数组的基本使用
        double[] hens={3,5,1,3.4,2,50,7.8,88.8,1.1,5.6,6,100};
        double totalWeight=0;
        for (int i = 0;i<hens.length;i++){
            totalWeight+=hens[i];
        }
        System.out.println("总体重为："+totalWeight);
        System.out.println("平均体重为："+(totalWeight/hens.length));
        //演示 数据类型 数组名[]=new 数据类型[大小]
//循环输入 5 个成绩，保存到 double 数组,并输出
        //步骤
//1. 创建一个 double 数组，大小 5
//(1) 第一种动态分配方式
//double scores[] = new double[5];
//(2) 第 2 种动态分配方式， 先声明数组，再 new 分配空间
        double[] scores; //声明数组， 这时 scores 是 null
        scores = new double[5]; // 分配内存空间，可以存放数据
//2. 循环输入
// scores.length 表示数组的大小/长度
//
        Scanner myScanner = new Scanner(System.in);
        for( int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+ (i+1) +"个元素的值");
//            scores[i] = myScanner.nextDouble();
        }
//输出，遍历数组
        System.out.println("==数组的元素/值的情况如下:===");
        for( int i = 0; i < scores.length; i++) {
            System.out.println("第"+ (i+1) +"个元素的值=" + scores[i]);
        }
//        数组的细节说明
        //1. 数组是多个相同类型数据的组合，实现对这些数据的统一管理
//int[] arr1 = {1, 2, 3, 60,"hello"};//String ->int
        double[] arr2 = {1.1, 2.2, 3.3, 60.6, 100};//int ->double
//2. 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用
        String[] arr3 = {"北京","jack","milan"};
//3. 数组创建后，如果没有赋值，有默认值
//int 0，short 0, byte 0, long 0, //float 0.0,double 0.0，char \u0000，
//boolean false，String null
//
        short[] arr4 = new short[3];
        System.out.println("=====数组 arr4=====");
        for(int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        //6. 数组下标必须在指定范围内使用，否则报：下标越界异常，比如
//int [] arr=new int[5]; 则有效下标为 0-4
//即数组的下标/索引 最小 0 最大 数组长度-1(4)
        int [] arr = new int[5];
//System.out.println(arr[5]);//数组越界
//        数组的应用案例
//        创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。
//        使用 for 循环访问所有元素并打印出来。
        char[] chars=new char[26];
        for (int i=0;i< chars.length;i++){
            char c='A';
            chars[i]=(char) (c+i);
        }
        for (int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }
//        请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标。
        int[] a={4,9,23, 10,-1};
        int max = a[0];//假定第一个元素就是最大值
        int maxIndex = 0; //
        for(int i = 1; i < a.length; i++) {//从下标 1 开始遍历 arr
            if(max < a[i]) {//如果 max < 当前元素
                max = a[i]; //把 max 设置成 当前元素
                maxIndex = i;
            }
        }
//当我们遍历这个数组 arr 后 , max 就是真正的最大值，maxIndex 最大值下标
        System.out.println("max=" + max + " maxIndex=" + maxIndex);
//        排序
        for (int i=0;i<a.length;i++){
            int temp=0;
            for (int j=0;j<a.length-i;j++) {
                if (a[i] > a[i + j]) {
                    temp = a[i];
                    a[i] = a[i + j];
                    a[i + j] = temp;
                }
            }
        }
        System.out.println("最大值为："+a[a.length-1]+"索引为："+(a.length-1));
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
//        数组的拷贝
        //将 int[] arr1 = {10,20,30}; 拷贝到 arr2 数组, //要求数据空间是独立的. int[] arr1 = {10,20,30};
//创建一个新的数组 arr2,开辟新的数据空间
//大小 arr1.length;
        int[] b1 = {10,20,30};
        int[] b2 = new int[b1.length];
//遍历 arr1 ，把每个元素拷贝到 arr2 对应的元素位置
        for(int i = 0; i < b1.length; i++) {
            b2[i] = b1[i];
        }
//老师修改 arr2， 不会对 arr1 有影响. arr2[0] = 100;
//输出 arr1
        b2[0] = 100;
        System.out.println("====b1 的元素====");
        for(int i = 0; i < b1.length; i++) {
            System.out.println(b1[i]);//10,20,30
        }
        System.out.println("====arr2 的元素====");
        for(int i = 0; i < b2.length; i++) {
            System.out.println(b2[i]);//
        }
//        数组的反抓
//        方法一：找规律转换
        int[] c={11,22,33,44,55,66};
        for (int i=0;i<c.length;i++){
            int temp=0;
            if (i<=c.length-i-1){
                temp=c[i];
                c[i]=c[c.length-i-1];
                c[c.length-i-1]=temp;
            }
        }
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
//        方法二：逆序赋值法
        for (int i=c.length-1;i>c.length/2;i--){
            int temp=0;
            temp=c[i];
            c[i]=c[c.length-i-1];
            c[c.length-i-1]=temp;
        }
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
//        数组的添加或扩容
//        要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java
//1) 原始数组使用静态分配 int[] arr = {1,2,3}
//2) 增加的元素 4，直接放在数组的最后 arr = {1,2,3,4}
//3) 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
        int[] d={1,2,3};
        char ch;
        Scanner sc=new Scanner(System.in);
        do {
            int[] e=new int[d.length+1];
            System.out.println("请添加一个数：");
            int m = sc.nextInt();
            for (int i = 0; i < d.length; i++) {
                e[i] = d[i];
            }
            e[e.length - 1] = m;
            d=e;
            for (int i = 0; i < d.length; i++) {
                System.out.println(d[i]);
            }
            System.out.println("是否继续添加（y/n）：");
            ch=sc.next().charAt(0);
        }while(ch=='y');
//        课后习题
//        有一个数组 {1， 2， 3， 4， 5}， 可以将该数组进行缩减，提示用户是否继续缩减，
//        每次缩减最后那个元素。当只剩最后一个元素，提示，不能再缩减。
        System.out.println("课后练习！");
        int[] arry={1,2,3,4,5};
        char ch1='y';
        do {
            int[] arry1=new int[arry.length-1];
            if (arry.length==1){
                System.out.println("不能再缩减！");
                break;
            }
            for (int i = 0; i < arry1.length; i++) {
                arry1[i] = arry[i];
            }
            arry = arry1;
            for (int i = 0; i < arry.length; i++) {
                System.out.println(arry[i]);
            }
            System.out.println("是否继续删除（y/n）：");
            ch1=sc.next().charAt(0);
        }while(ch1=='y');
    }
}
