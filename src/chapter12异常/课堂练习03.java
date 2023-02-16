package chapter12异常;

public class 课堂练习03 {
    public static int method(){
        int i = 1;
        try{
            i++;
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
            return ++i;
        }finally {//必须执行
            ++i;
            System.out.println("i=" + i);
        }
    }

    public static void main(String[] args) {
        System.out.println(method());//3
    }
}
