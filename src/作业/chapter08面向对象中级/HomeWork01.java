package 作业.chapter08面向对象中级;

public class HomeWork01 {
    public static void main(String[] args) {
        Person person = new Person("张三", 20, "会计");
        Person person1 = new Person("李四", 30, "会计");
        Person person2 = new Person("王五", 45, "会计");
        Person[] persons = new Person[3];
        persons[0] = person;
        persons[1] = person1;
        persons[2] = person2;
        Person temp;
        for (int i = 0; i < persons.length-1; i++) {
            for (int j = 0; j < persons.length-1-i; j++) {
                if (persons[j].getAge() > persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[i] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName()+" "+persons[i].getAge()+" "+persons[i].getJob());
        }
    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}