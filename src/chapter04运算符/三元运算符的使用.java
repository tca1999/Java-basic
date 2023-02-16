package chapter04运算符;

public class 三元运算符的使用 {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
// 解读
// 1. a > b 为 false
// 2. 返回 b--, 先返回 b 的值,然后在 b-1
// 3. 返回的结果是 99
        int result = a > b ? a++ : b--;
        System.out.println("result=" + result);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        //表达式 1 和表达式 2 要为可以赋给接收变量的类型
//(或可以自动转换/或者强制转换)
        int c = a > b ? (int)1.1 : (int)3.4;//可以的
        double d = a > b ? a : b + 3;//可以的，满足 int -> double
//        课堂练习1
//        实现三个数的最大值
        int n1=553;
        int n2=33;
        int n3= 123;
        int max1=n1>n2?n1:n2;
        int max2=max1>n3?max1:n3;
        System.out.println(max2);
//        使用一条语句输出
        int max = (n1>n2?n1:n2)>n3?(n1>n2?n1:n2):n3;
        System.out.println(max);
    }
}
