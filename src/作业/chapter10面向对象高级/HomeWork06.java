package 作业.chapter10面向对象高级;


public class HomeWork06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧",new Horse());
        person.comm();
        person.passRiver();
        person.flay();
    }
}
interface Vehicles{
    String  work();
}
class Horse implements Vehicles{
    @Override
    public String work() {
        return "Horse在工作";
    }
}
class Boat implements Vehicles{
    @Override
    public String  work() {
        return "Boat在工作";
    }
}
class Fj implements Vehicles{
    @Override
    public String work() {
        return "飞机正在工作";
    }
}
class Gc{
    private static Horse horse = new Horse();
    private Gc(){}
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Fj getFj(){
        return new Fj();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        if (!(vehicles instanceof Boat)) {
            vehicles = Gc.getBoat();
        }
        System.out.println(vehicles.work());
    }
    public void comm(){
        if (!(vehicles instanceof Horse)) {
            vehicles = Gc.getHorse();
        }
        System.out.println(vehicles.work());
    }
    public void flay(){
        if (!(vehicles instanceof Fj)) {
            vehicles = Gc.getFj();
        }
        System.out.println(vehicles.work());
    }
}