package 作业.chapter12异常;

public class HomeWork02 {
    public static void main(String[] args) {
        if (args[4].equals("wwww")){
            System.out.println("AA");
        }else {
            System.out.println("VV");
        }
        Object o = args[2];
        Integer i = (Integer) o;
    }
}
