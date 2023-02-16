package 作业.chaptere14集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) {
        Car car = new Car("宝马", 200000);
        Car car1 = new Car("宾利", 300000);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        arrayList.add(car);
        arrayList.add(car1);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList1.add(arrayList.get(i));
        }
        System.out.println(arrayList);
        arrayList.remove(car1);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(car1));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        System.out.println(arrayList);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList1);
        System.out.println(arrayList.containsAll(arrayList1));
        System.out.println(arrayList.removeAll(arrayList1));
        for (Object o :arrayList1) {
            System.out.println(o);
        }
        Iterator iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
