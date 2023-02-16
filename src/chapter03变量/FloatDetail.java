package chapter03变量;

public class FloatDetail {
    public static void main(String[] args) {
//        java的浮点型常量（具体值）默认为double型，声明float型常量，需要加f或F
//        float num1 = 1;错误
        float num2 = 1.1f;
        double num3 = 1.1;
        double num4 = 1.1f;
//        十进制数形式：5.12 512.0f 。512(必须有小数点)
        double num5 = .123;//等价0.123
        System.out.println(num5);
//        科学计数法
        System.out.println(5.12e2);//512.0
        System.out.println(5.12E-2);//0.0512
//        通常情况下，使用double型，因为比float型更精确
        double num9 = 2.12345678951;
        float num10 = 2.12345678951f;
        System.out.println(num9);
        System.out.println(num10);
//        浮点数的陷阱
        double num11 = 2.7;
        double num12 = 2.7;//8.1/3;
        System.out.println(num11);
        System.out.println(num12);
//        得到一个重要的使用点，当我们对运算结果是小数的进行相等判断时，要小心
//        应该是以两个数的差值的绝对值，在某个精度范围内判断
        if (num11 == num12){
            System.out.println("num11===num12相等");
        }
//        正确写法
        if (Math.abs(num11 - num12)<1.0E-15){
            System.out.println("差值非常小");
        }
        System.out.println(Math.abs(num11 - num12));
//        细节：直接复制或直接查询的小数，是可以判断相等的
    }
}
