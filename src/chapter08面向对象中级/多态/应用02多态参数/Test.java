package chapter08面向对象中级.多态.应用02多态参数;

public class Test {
    public static void main(String[] args) {
        Emp emp = new Emp("张三", 10000);
        Manager manager = new Manager("李四", 10000,500);
        System.out.println(showEmpAnnual(emp));
        System.out.println(showEmpAnnual(manager));
        testWork(emp);
        testWork(manager);
    }
    public static double showEmpAnnual(Employee employee){
        return employee.getAnnual();
    }
    public static void testWork(Employee employee){
        if (employee instanceof Emp){
            ((Emp) employee).work();
        }else if (employee instanceof Manager){
            ((Manager) employee).manage();
        }else {
            System.out.println();
        }
    }
}
