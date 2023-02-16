package chapter14集合.Collection.Set;

import java.util.Set;

@SuppressWarnings("all")
public class LinkedHashSet {
    public static void main(String[] args) {
        Set set = new java.util.LinkedHashSet();
        set.add(new String("AA"));
        set.add("BB");
        set.add(456);
        System.out.println(set);
        /*
        1.linkedhashset读存数据的顺序是相同的
        2.底层维护的是linkedhashmap（是hashmap的子列）
        3.底层结构：数组table+双向链表
        4.数组table扩容到16，存放发的类型是linkedhashmap$entry
        5.数组是haspmap$node【】 存放的数据是linkedhashmap$entry
         */
    }
}
