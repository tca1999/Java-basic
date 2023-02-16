package 作业.chapter13常用类;

public class HomeWork03 {
    public static void main(String[] args) {
        print("Han shun ping");
    }
    public static void print(String str){
        String[] s = str.split(" ");
        char[] chars = s[1].toUpperCase().toCharArray();
        System.out.println(s[2] + "," + s[0] + "." +chars[0]);
    }
}
