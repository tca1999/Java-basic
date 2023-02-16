package chapter14集合.Collection.List;

import java.util.*;

public class List的三种遍历方式 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //List 接口的实现子类 Vector LinkedList
//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();
        list.add("jack");
        list.add("tom");
        list.add("鱼香肉丝");
        list.add("北京烤鸭子");
//遍历
//1. 迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        System.out.println("=====增强 for=====");
//2. 增强 for
        for (Object o : list) {
            System.out.println("o=" + o);
        }
        System.out.println("=====普通 for====");
//3. 使用普通 for
        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象=" + list.get(i));
        }
    }
}
