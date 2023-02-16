package chapter07面向对象基础;

public class 课堂练习01 {
    public static void main(String[] args) {
        AA1 aa1 = new AA1();
        boolean b = aa1.compare(4);
        System.out.println(b);
        BB bb = new BB();
        bb.print(5,4,'*');
    }
}
//判断技术还是偶数，放回布尔值
class AA1{
    public boolean compare(int a){
        boolean b=false;
        if (a % 2 == 0){
            b=true;
        }
        return b;
    }
}
//根据行、列、字符打印 对应行数和列数的字符，比如：行：4，列：4，字符#,则打印相应的效果
class BB{
    public void print(int a,int b,char c){
        for (int i = 0;i < a;i++){
            for (int j = 0;j < b;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}