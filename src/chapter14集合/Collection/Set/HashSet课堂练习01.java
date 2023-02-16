package chapter14集合.Collection.Set;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashSet课堂练习01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Employee("tom",18));
        set.add(new Employee("tom",8));
        set.add(new Employee("tom",18));
        set.add(new Employee("jack",18));
        set.add(new Employee("jack",28));
        for (Object o : set) {
            System.out.println(o);
        }

    }
}
class Employee{
    private String name;
    private int  age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}