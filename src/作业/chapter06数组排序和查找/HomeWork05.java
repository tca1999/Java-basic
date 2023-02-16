package 作业.chapter06数组排序和查找;

public class HomeWork05 {
    public static void main(String[] args) {
//        随机生成10个整数保存到数组，并倒序打印以及求平均值、最大值、最小值的下表和判读是否有8
        int[] arr=new int[10];//定义数组
        for (int i=0;i< arr.length;i++){//循环给数组赋值
            int a= (int) (Math.random()*100)+1;
            arr[i]=a;
        }
        for (int i=0;i<arr.length;i++){//正序打印数组
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+"\t");
        }
        int max=arr[0];//将第一个元素设为最大值
        int min=arr[0];//将第一个元素设为最小值
        int index_max=0;//最大值的索引
        int index_min=0;//最小值的索引
        for (int i=1;i< arr.length;i++){//找出最大值及其索引
            if (max<arr[i]){
                max=arr[i];
                index_max=i;
            }
        }
        for (int i=1;i<arr.length;i++){//找出最小值及其索引
            if (min>arr[i]){
                min=arr[i];
                index_min=i;
            }
        }
        int sum =0;//定义数组之和
        boolean b=false;//定义判读变量
        for (int i=0;i<arr.length;i++){//倒序打印、求和、判断数组是否有8
            sum+=arr[i];
            if (arr[i]==8){
                b=true;
            }
        }
        System.out.println();
        System.out.println("最大值为："+max+"下标为："+index_max);
        System.out.println("最小值为："+min+"下标为："+index_min);
        System.out.println("平均值为："+(sum/arr.length));
        if (b){
            System.out.println("8在数组arr中！");
        }else {
            System.out.println("8不在数组arr中！");
        }
    }
}
