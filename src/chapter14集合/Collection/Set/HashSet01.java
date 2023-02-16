package chapter14集合.Collection.Set;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        //执行add方法，会返回boolean值，成功返回true，失败返回false
        System.out.println(set.add("john"));//T
        System.out.println(set.add("lucy"));//T
        System.out.println(set.add("john"));//F
        System.out.println(set.add("jcak"));//T
        System.out.println(set.add("john"));//F
        System.out.println(set.add("Rose"));//T
        set.remove("john");
        System.out.println(set);
        HashSet set1 = new HashSet();
        set1.add("lucy");
        set1.add("lucy");
        set1.add(new Dog("tom"));
        set1.add(new Dog("tom"));
        System.out.println(set1);//输出三个
        set1.add(new String("hsp"));
        set1.add(new String("hsp"));
        System.out.println(set1);
    }
}
class Dog{
    String name;

    public Dog(String name) {
        this.name = name;
    }


}