package chapter14集合.Map;


import java.util.*;

@SuppressWarnings({"all"})
public class Map课堂练习01 {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Employee tom = new Employee(1, "tom", 10000);
        Employee nacy = new Employee(2, "nacy", 20000);
        Employee smith = new Employee(3, "smith", 30000);
        hashMap.put(tom.getId(),tom);
        hashMap.put(nacy.getId(),nacy);
        hashMap.put(smith.getId(),smith);
        System.out.println("-----keySet-----");
        Set keySet = hashMap.keySet();
        System.out.println("-----增强for-----");
        for (Object o : keySet) {
            Employee employee = (Employee) hashMap.get(o);
            if (employee.getSal() > 18000){
                System.out.println(employee);
            }
        }
        System.out.println("-----迭代器-----");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Employee employee = (Employee) hashMap.get(next);
            if (employee.getSal() > 18000){
                System.out.println(employee);
            }
        }
        System.out.println("-----values-----");
        Collection values = hashMap.values();
        System.out.println("-----增for-----");
        for (Object o :values) {
            Employee employee = (Employee) o;
            if (employee.getSal() > 18000){
                System.out.println(o);
            }
        }
        System.out.println("-----迭代器-----");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            Employee employee = (Employee) next;
            if(employee.getSal() > 18000){
                System.out.println(next);
            }
        }
        System.out.println("-----entrySet-----");
        Set entrySet = hashMap.entrySet();
        System.out.println("-----增强for-----");
        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;
            Employee employee = (Employee) entry.getValue();
            if (employee.getSal() > 18000){
                System.out.println(employee);
            }
        }
        System.out.println("-----迭代器-----");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            Map.Entry entry = (Map.Entry) next;
            Employee employee = (Employee) entry.getValue();
            if (employee.getSal() > 18000){
                System.out.println(employee);
            }
        }
    }
}
class Employee{
    private int id;
    private String name;
    private double sal;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}