package chapter04运算符;

public class 算数运算符的细节 {
    public static void main(String[] args) {
        // int i = 1;//i->1
// i = i++; //规则使用临时变量: (1) temp=i;(2) i=i+1;(3)i=temp;
// System.out.println(i); // 1
// int i=1;
// i=++i; //规则使用临时变量: (1) i=i+1;(2) temp=i;(3)i=temp;
// System.out.println(i); //2
//
// 测试输出
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i="+i);//10
        System.out.println("i2="+i2);//20
        i = --i2;
        System.out.print("i="+i);//19
        System.out.println("i2="+i2);//19
        //1.需求:
//假如还有 59 天放假，问：合 xx 个星期零 xx 天
//2.思路分析
//(1) 使用 int 变量 days 保存 天数
//(2) 一个星期是 7 天 星期数 weeks： days / 7 零 xx 天 leftDays days % 7
//(3) 输出
//3.走代码
        int days = 25911;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println(days + "天 合" + weeks + "星期零" + leftDays + "天");
        //定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为
//：5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度
//
//2 思路分析
//(1) 先定义一个 double huaShi 变量保存 华氏温度
//(2) 根据给出的公式，进行计算即可 5/9*(华氏温度-100)
// 考虑数学公式和 java 语言的特性
//(3) 将得到的结果保存到 double sheShi
//3 走代码
        double huaShi = 1234.6;
        double sheShi = 5.0 / 9 * (huaShi - 100);
        System.out.println("华氏温度" + huaShi
                + " 对应的摄氏温度=" + sheShi);
    }
}
