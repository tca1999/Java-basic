package 作业.chapter07面向对象基础;

public class HomeWork06 {
    public static void main(String[] args) {
        Cale c1 = new Cale(10,5);
        System.out.println("第一个对象的结果！");
        System.out.println(c1.he() + "\t" + c1.cha() + "\t" + c1.cheng() + "\t" + c1.shang());
        Cale c2 = new Cale(10,0);
        System.out.println("第二个对象的结果！");
        System.out.println(c2.he() + "\t" + c2.cha() + "\t" + c2.cheng() + "\t" + c2.shang());;
    }
}
class Cale{
    int a;
    int b;
    public Cale(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int he(){
        return this.a + this.b;
    }
    public int cha(){
        return this.a - this.b;
    }
    public int cheng(){
        return this.a * this.b;
    }
    public String shang(){
        if (this.b == 0){
            return "除数不能为0！";
        }
        return String.valueOf(this.a / this.b);
    }
}