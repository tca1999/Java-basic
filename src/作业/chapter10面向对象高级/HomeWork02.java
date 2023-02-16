package 作业.chapter10面向对象高级;

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println("第一次："+Frock.getNextNum());
        System.out.println("第二次："+Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
    }
}
class Frock{
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum(){
        return currentNum += 100;
    }
}