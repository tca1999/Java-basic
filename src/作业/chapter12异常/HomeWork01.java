package 作业.chapter12异常;

public class HomeWork01 {
    public static void main(String[] args) {
        EcmDef ecmDef = new EcmDef();
        int a = Integer.parseInt("wwww");
        ecmDef.cal(a,3);
//        ecmDef.cal(10,0);
    }
}
class EcmDef{
    public void cal(int n1, int n2){
        try {
            double result = n1 / n2;
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("数据格式不正确");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("除0进行异常处理");
        }
    }
}