package 作业.chapter06数组排序和查找;

public class HomeWork06 {
    public static void main(String[] args) {
//        冒泡排序的代码：从大到小
        int[] arr=new int[10];
        for (int i=0;i< arr.length;i++){
            int a= (int) (Math.random()*100);
            arr[i]=a;
        }
        for (int i=0;i< arr.length-1;i++){
            int temp=0;
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
