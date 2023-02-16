package chapter07面向对象基础;

public class 方法重载 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.m(2);
        methods.m(2,3);
        methods.m("hello world");
        System.out.println(methods.max(2,3));
        System.out.println(methods.max(2.0,3.0));
        System.out.println(methods.max(2.0,3.0,4.0));
        System.out.println(methods.sum(1,2,3,4,5));
    }
}
class Methods{
    public void m(int a){
        System.out.println("平方运算的结果：" + a * a);
    }
    public void m(int a,int b){
        System.out.println("两数相乘的记过："+ a * b);
    }
    public void m(String str){
        System.out.println("字符串的信息：" + str);
    }
    public int max(int a,int b){
        return Math.max(a, b);
    }
    public double max(double a,double b){
        return Math.max(a,b);
    }
    public double max(double a,double b,double c){
        return Math.max(a,Math.max(b,c));
    }
    public int sum(int... nums){
//        可以当作数组使用
        int res = 0;
        for (int i = 0;i < nums.length;i++){
            res += nums[i];
        }
        return res;
    }
}