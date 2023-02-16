package 作业.chapter10面向对象高级;

public class HomeWork07 {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.getAir().flow();
        Car car1 = new Car(30);
        car1.getAir().flow();
        Car car2 = new Car(-10);
        car2.getAir().flow();
    }
}
class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public class Air{
        public void flow(){
            if (temperature > 40){
                System.out.println("吹冷风");
            }else if (temperature < 0){
                System.out.println("吹热风");
            }else {
                System.out.println("关闭空调");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}