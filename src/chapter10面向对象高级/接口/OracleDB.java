package chapter10面向对象高级.接口;

//B 程序员连接 Oracle
public class OracleDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接 oracle");
    }
    @Override
    public void close() {
        System.out.println("关闭 oracle");
    }
}
