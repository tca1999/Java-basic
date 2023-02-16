package 作业.chapter07面向对象基础;

public class HomeWork04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        A03 a03 = new A03();
        int[] arr_new = a03.copyArr(arr);
        for (int i = 0; i < arr_new.length; i++) {
            System.out.print(arr_new[i] + "\t");
        }
    }
}
class A03{
    public int[] copyArr(int[] arr){
        int[] arr_new = new int[arr.length];
        for (int i = 0;i < arr.length;i++){
            arr_new[i] = arr[i];
        }
        return arr_new;
    }
}