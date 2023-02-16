package chapter07面向对象基础;

public class 成员方法_课堂练习02 {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6},{7,8}};
        MyTools1 myTools1 = new MyTools1();
        myTools1.print(arr);
        Person2 person2 = new Person2();
        person2.name = "渣男";
        person2.age = 20;
        person2.copyPerson(person2);
        System.out.println(person2.name + "\t" + person2.age);
        System.out.println(person2 == person2.copyPerson(person2));
    }
}
class MyTools1{
    public void print(int[][] arr){
        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
class Person2{
    String name;
    int age;
    public Person2 copyPerson(Person2 person2){
        person2 = new Person2();
        person2.name = "渣女";
        person2.age = 18;
        return person2;
    }
}
