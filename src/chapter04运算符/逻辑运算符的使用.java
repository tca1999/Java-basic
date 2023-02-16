package chapter04运算符;

public class 逻辑运算符的使用 {
    public static void main(String[] args) {
        //&&短路与 和 & 案例演示
        int age = 50;
        if(age > 20 && age < 90) {
            System.out.println("ok100");
        }
        //&逻辑与使用
        if(age > 20 & age < 90) {
            System.out.println("ok200");
        }
//区别
        int a = 4;
        int b = 9;
//对于&&短路与而言，如果第一个条件为 false ,后面的条件不再判断
//对于&逻辑与而言，如果第一个条件为 false ,后面的条件仍然会判断
        if(a < 1 & ++b < 50) {
            System.out.println("ok300");
        }
        System.out.println("a=" + a + " b=" + b);// 4 10
        //||短路或 和 |逻辑或 案例演示
//|| 规则: 两个条件中只要有一个成立，结果为 true,否则为 false
//| 规则: 两个条件中只要有一个成立，结果为 true,否则为 false
        int age1 = 50;
        if(age1 > 20 || age1 < 30) {
            System.out.println("ok100");
        }
//&逻辑与使用
        if(age > 20 | age < 30) {
            System.out.println("ok200");
        }
        //看看区别
//(1)||短路或：如果第一个条件为 true，
//则第二个条件不会判断，最终结果为 true，效率高
//(2)| 逻辑或：不管第一个条件是否为 true，第二个条件都要判断，效率低
        int a1 = 4;
        int b1 = 9;
        if( a1 > 1 | ++b1 > 4) { // 可以换成 | 测试
            System.out.println("ok300");
        }
        System.out.println("a=" + a1 + " b=" + b1); //4 10
        //! 操作是取反 T->F , F -> T
        System.out.println(60 > 20); //T
        System.out.println(!(60 > 20)); //F
//a^b: 叫逻辑异或，当 a 和 b 不同时，则结果为 true, 否则为 false
        boolean b2 = (10 > 1) ^ ( 3 > 5);
        System.out.println("b=" + b2);//T
//        练习题1
        int x = 5;
        int y = 5;
        if(x++ == 6 && ++y == 6){
            x = 11;
        }
        System.out.println("x="+x+"y="+y);
        int x1 = 5;
        int y1 = 5;
        if(x1++ == 6 & ++y1 == 6){
            x1 = 11;
        }
        System.out.println("x1="+x1+"y1="+y1);
        int x2 = 5;
        int y2 = 5;
        if(x2++ == 5 | ++y2 == 5){
            x2 = 11;
        }
        System.out.println("x2="+x2+"y2="+y2);
        int x3 = 5;
        int y3 = 5;
        if(x3++ == 5 || ++y3 == 5){
            x3 = 11;
        }
        System.out.println("x3="+x3+"y3="+y3);
//        练习题2
        boolean x4 = true;
        boolean y4 = false;
        short z = 46;
        if((z++ == 46) && (y4 = true)) z++;//48
        if((x4=false) || (++z==49)) z++;
        System.out.println("z="+z);//50
    }
}
