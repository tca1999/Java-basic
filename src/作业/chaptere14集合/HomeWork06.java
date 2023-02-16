package 作业.chaptere14集合;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HomeWork06 {
    public static void main(String[] args) {
        Person1 tom = new Person1("1", "tom");
        Person1 nacy = new Person1("2", "nacy");
        HashSet hashSet = new HashSet();
        hashSet.add(tom);
        hashSet.add(nacy);
        tom.name = "smith";
        hashSet.remove(tom);
        System.out.println(hashSet);
        hashSet.add(new Person1("1","CC"));
        System.out.println(hashSet);
        hashSet.add(new Person1("1","tom"));
        System.out.println(hashSet);
    }
}
class Person1{
    public String id;
    public String name;

    public Person1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return Objects.equals(id, person1.id) && Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}