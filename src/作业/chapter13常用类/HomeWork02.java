package 作业.chapter13常用类;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.next();
        System.out.println("请输入密码");
        String pwd = scanner.next();
        System.out.println("请输入邮箱：");
        String port = scanner.next();
        try {
            userRegister(name,pwd,port);
            System.out.println("注册成功！");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void userRegister(String name,String pwd,String port){
        if (!(name != null && pwd != null && port != null)){
            throw new RuntimeException("参数不能为空！");
        }
        if (!( name.length()>=2 && name.length() <= 4)){
            throw new RuntimeException("用户名不能为空或长度超过限制！");
        }
        if (!( pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码格式不正确！");
        }
        if (!(port.indexOf("@") > 0 && port.indexOf("@") < port.indexOf("."))){
            throw new RuntimeException("邮箱格式不正确！");
        }

    }
    public static boolean isDigital(String pwd){
        char[] chars = pwd.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9'){
                return false;
            }
        }
        return true;
    }
}
