package chapter08面向对象中级.多态.应用01多态数组;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Student student1 = new Student();
        Teacher teacher = new Teacher();
        Teacher teacher1 = new Teacher();
        Person[] persons = {person,student,student1,student1,teacher,teacher1};
        for (int i = 0; i < persons.length; i++) {
            persons[i].say();
            if (persons[i] instanceof Student){
                ((Student) persons[i]).study();
            }else if (persons[i] instanceof Teacher){
                ((Teacher) persons[i]).teach();
            }else if (persons[i] instanceof Person){
                persons[i].say();
            }else {
                System.out.println("null");
            }
        }
    }
}
