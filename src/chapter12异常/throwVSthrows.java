package chapter12异常;

public class throwVSthrows {
    public static void main(String[] args) {
        try {
            throwVSthrows.methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        throwVSthrows.methodB();
    }
    static void methodA(){
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        }finally {
            System.out.println("用A方法的finally");
        }
    }
    static void methodB(){
        try{
            System.out.println("进入方法B");
            return;
        }finally {
            System.out.println("调用方法B的finally");
        }
    }
}
