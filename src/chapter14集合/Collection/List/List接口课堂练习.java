package chapter14集合.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List接口课堂练习 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello" + i);
        }
        list.add(2,"韩顺平教育");
        System.out.println(list);
        System.out.println(list.get(5));
        list.remove(6);
        System.out.println(list);
        list.set(7,"hahaha");
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
