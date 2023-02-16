package 作业.chapter08面向对象中级.HomeWork05;

public class HomeWork05 {
    public static void main(String[] args) {
        Employee[] employees=new Employee[5];
        employees[0] = new Worker("工人", 5000);
        employees[1] = new Peasant("农名",5000);
        employees[2] = new Teacher("老师",5000,45,100);
        employees[3] = new Scientist("科学家",5000,15000);
        employees[4] = new Waiter("服务生",5000);
        for (int i = 0; i < employees.length; i++) {
            employees[i].printTotalSal();
        }
    }
}
