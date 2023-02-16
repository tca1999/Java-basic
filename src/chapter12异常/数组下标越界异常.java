package chapter12异常;

public class 数组下标越界异常 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
