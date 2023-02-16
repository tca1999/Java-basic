package chapter13常用类.包装类;

public class Integer面试题01 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false
        //所以，这里主要是看范围 -128 ~ 127 就是直接返回
/*
老韩解读
//1. 如果 i 在 IntegerCache.low(-128)~IntegerCache.high(127),就直接从数组返回
//2. 如果不在 -128~127,就直接 new Integer(i)
public static Integer valueOf(int i) {
if (i >= IntegerCache.low && i <= IntegerCache.high)
return IntegerCache.cache[i + (-IntegerCache.low)];
return new Integer(i);
}
*/
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false

    }
}
