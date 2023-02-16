package chapter13常用类.包装类;


public class 课堂练习01 {
    public static void main(String[] args) {
        //自动装箱
        Double d = 100d;
        Float f = 1.5f;
        //三元运算符看作一个整体 优先级不同则要提升优先级
        Object obj1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj1);
        //独立语句 分别运算
        Object obj2;
        if (true){
            obj2 = new Integer(1);
        }else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);
    }
}
