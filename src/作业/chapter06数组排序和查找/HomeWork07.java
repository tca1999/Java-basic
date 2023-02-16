package 作业.chapter06数组排序和查找;

public class HomeWork07 {
    public static void main(String[] args) {
        char[] arr1={'a','z','b','c'};
        char[] arr2=arr1;
        arr2[2]='韩';
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr1[i]+","+arr2[i]);//a z 韩 c,a z 韩 c
        }
    }
}
