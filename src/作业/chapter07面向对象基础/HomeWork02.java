package 作业.chapter07面向对象基础;

public class HomeWork02 {
    public static void main(String[] args) {
        String[] strings = {"abc","abed","abide"};
        String string = "abc";
        A02 a02 = new A02();
        System.out.println(a02.find(strings,string));
    }
}
class A02{
    public int find(String[] strings,String string){
        for (int i = 0;i < strings.length;i++){
            if (strings[i].equals(string)){
                return i;
            }
        }
        return -1;
    }
}