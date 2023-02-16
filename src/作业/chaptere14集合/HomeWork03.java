package 作业.chaptere14集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

@SuppressWarnings("all")
public class HomeWork03 {
    public static void main(String[] args) {
        Emp jack = new Emp("jack", 650);
        Emp tom = new Emp("tom", 1200);
        Emp smith = new Emp("smith", 2900);
        HashMap hashMap = new HashMap();
        hashMap.put(jack.getName(),jack.getSal());
        hashMap.put(tom.getName(),tom.getSal());
        hashMap.put(smith.getName(),smith.getSal());
        hashMap.put(jack.getName(),2600);
        Set set = hashMap.keySet();
        for (Object o : set) {
            hashMap.put(o,(int) hashMap.get(o) + 100);
            System.out.println(o);
        }
        Collection values1 = hashMap.values();
        for (Object o : values1) {
            System.out.println(o);
        }

    }
}
class Emp{
    private String name;
    private int sal;

    public Emp(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}