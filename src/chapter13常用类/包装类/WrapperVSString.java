package chapter13常用类.包装类;

public class WrapperVSString {
    public static void main(String[] args) {
//包装类(Integer)->String
        Integer i = 100;//自动装箱
        //方式 1
        String str1 = i + "";
//方式 2
        String str2 = i.toString();
//方式 3
        String str3 = String.valueOf(i);
//String -> 包装类(Integer)
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);//使用到自动装箱
        Integer i3 = new Integer(str4);//构造器
        System.out.println("ok~~");
    }
}
