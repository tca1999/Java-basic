package 作业.chapter05程序控制语句;

public class HomeWork07 {
    public static void main(String[] args) {
//        输出小写的a-z以及大写Z-A
        for (char c='a';c<='z';c++){
            System.out.print(c+"\t");
        }
        System.out.println();
        for (char c='Z';c>='A';c--){
            System.out.print(c+"\t");
        }
    }
}
