package 作业.chapter07面向对象基础;

public class HomeWork13 {
    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        passObject.printAreas(new Circle1(),5);
    }
}
class Circle1{
    double radius;
    public double findArea(){
        return radius * radius * 3.14;
    }
}
class PassObject{
    public void printAreas(Circle1 circle1,int times){
        System.out.println("Radius\t\tArea");
        for (int i = 1;i <= times;i++){
            circle1.radius = i;
            System.out.println(circle1.radius + "\t\t" + circle1.findArea());
        }
    }
}