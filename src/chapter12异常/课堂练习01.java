package chapter12异常;

public class 课堂练习01 {
    public static int method(){
        try{
            String[] names = new String[3];
            if (names[1].equals("tom")){
                System.out.println(names[1]);
            }else {
                names[3] = "wwww";
            }
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            return 2;
        }catch (NumberFormatException e){
            return 3;
        }finally {//必须执行
            return 4;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());//4
    }
}
