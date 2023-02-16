package chapter06数组排序和查找;

public class 冒泡排序 {
    public static void main(String[] args) {
//        案例
//        将五个无序：24,69,80,57,13 使用冒泡排序法将其排成一个从小到大的有
//序数列
        int[] arr={24, 69, 80, 57, 13, -1, 30, 200, -110};
        int temp=0;//交换变量
        for (int i=0;i<arr.length-1;i++){//循环轮次
            for (int j=0;j<arr.length-1-i;j++) {//循环比较
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
//        韩老师讲解、
//        int[] arr = {24, 69, 80, 57, 13, -1, 30, 200, -110};
//        int temp = 0; //用于辅助交换的变量
////将多轮排序使用外层循环包括起来即可
////先死后活 =》 4 就是 arr.length - 1
//        for( int i = 0; i < arr.length - 1; i++) {//外层循环是 4 次
//            for( int j = 0; j < arr.length - 1 - i; j++) {//4 次比较-3 次-2 次-1 次
////如果前面的数>后面的数，就交换
//                if(arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//            System.out.println("\n==第"+(i+1)+"轮==");
//            for(int j = 0; j < arr.length; j++) {
//                System.out.print(arr[j] + "\t");
//            }
//        }

    }
}
