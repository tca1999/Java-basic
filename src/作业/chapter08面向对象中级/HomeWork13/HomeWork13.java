package 作业.chapter08面向对象中级.HomeWork13;

public class HomeWork13 {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Student("1", 18, '1', 123);
        person[2] = new Student("2", 20, '1', 1234);
        person[1] = new Teacher("3", 30, '1', 4);
        person[3] = new Teacher("4", 50, '1', 6);
        Person temp;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j+1].getAge()) {
                    temp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            person[i].showInfo();
        }
    }
}
