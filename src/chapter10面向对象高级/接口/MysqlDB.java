package chapter10面向对象高级.接口;

//A 程序
public class MysqlDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接 mysql");
    }
    @Override
    public void close() {
        System.out.println("关闭 mysql");
    }
}
