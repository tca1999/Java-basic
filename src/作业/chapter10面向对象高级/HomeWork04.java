package 作业.chapter10面向对象高级;

public class HomeWork04 {
    public static void main(String[] args) {
        new CellPhone().testWork(new JSQ() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },100,200);
    }
}
interface JSQ{
    double work(double n1,double n2);
}
class CellPhone{
    public void testWork(JSQ jsq,double n1,double n2){
        double work = jsq.work(n1, n2);
        System.out.println(work);
    }
}