package chapter07面向对象基础;

public class Ex03 {
    public static void main(String[] args) {
        //请遍历一个数组 , 输出数组的各个元素值
        int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
//使用方法完成输出, 创建 MyTools 对象
        MyTools tool = new MyTools();
//遍历 map 数组
//传统的解决方式就是直接遍历
// for(int i = 0; i < map.length; i++) {
// for(int j = 0; j < map[i].length; j++) {
// System.out.print(map[i][j] + "\t");
// }
// System.out.println();
// }
//使用方法
        tool.printArr(map);
    }
}
class MyTools{
    public void printArr(int[][] map) {
        System.out.println("=======");
//对传入的 map 数组进行遍历输出
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "_");
            }
            System.out.println();
        }
    }
}
