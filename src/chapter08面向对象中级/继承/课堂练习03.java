package chapter08面向对象中级.继承;


public class 课堂练习03 {
    public static void main(String[] args) {
        PC pc = new PC();
        pc.CPU = "i5";
        pc.neicun = "16GB";
        pc.yinpan = "1TB";
        pc.brand = "联想";
        System.out.println(pc.getDetails() + pc.brand);
        NotePad notePad = new NotePad();
        notePad.CPU = "i5";
        notePad.neicun = "16GB";
        notePad.yinpan = "1TB";
        notePad.color = "黑色";
        System.out.println(notePad.getDetails() + notePad.color);
    }
}
class Computer{
    String CPU;
    String neicun;
    String yinpan;
    public String getDetails(){
        return "CPU：" + CPU + " 内存：" + neicun + " 硬盘：" + yinpan;
    }
}
class PC extends Computer{
    String brand;
}
class NotePad extends Computer{
    String color;
}