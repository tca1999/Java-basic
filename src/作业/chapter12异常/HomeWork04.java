package 作业.chapter12异常;

public class HomeWork04 {
    static void showExce() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args) {
        // B C D
        try {
            showExce();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
}
