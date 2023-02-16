package 作业.chapter07面向对象基础;



public class HomeeWork01 {
    public static void main(String[] args) {
        double[] doubles = {1.1,2.2,3.3,4.4};
        A01 a01 = new A01();
        System.out.println(a01.max(doubles));
    }
}
class A01{
    public double max(double[] doubles){
        double max = doubles[0];
        for (int i = 1;i < doubles.length;i++){
            if (max < doubles[i]){
                max = doubles[i];
            }
        }
        return max;
    }
}