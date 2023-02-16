package chapter13常用类.String类;

public class 面试题 {
    public static void main(String[] args) {
        System.out.println("第一题");
        //创建了一个对象 String a = "hello" + "abc"; 优化等价于 String a = "helloabc";
        String a = "hello" + "abc";
        System.out.println("第二题");
        //创建了3个对象
        //先创建StringBuilder sb；
        //执行sb.append（“hello”）
        //在执行sb.append（“abc）
        //最后 String c1 = sb.toString()
        String a1 = "hello";
        String b1 = "abc";
        //c1 相当于创建对象
        String c1 = a1 +b1;
        String d1 = "helloabc";
        System.out.println(c1 == d1);
        String e1 = "hello" + "abc";
        System.out.println(d1 == e1);
        System.out.println("第三题");
        String s1 = "hspedu";
        String s2 = "java";
        String s3= "hspedujava";
        String s4= (s1 + s2).intern();
        System.out.println(s3 == s4);//T
        System.out.println(s3.equals(s4));//T
        System.out.println("第六题");
        Test test = new Test();
        test.change(test.str, test.ch);
        System.out.println(test.str);//hsp
        System.out.println(test.ch);//hava
    }
}
class Test{
    String str = new String("hsp");
    final char[] ch = {'j','a','v','a'};
    public void change(String str,char[] ch){
        str = "java";
        ch[0] = 'h';
    }
}