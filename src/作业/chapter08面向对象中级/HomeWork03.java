package 作业.chapter08面向对象中级;


public class HomeWork03 {
    public static void main(String[] args) {
        Teacher teacher = new Professor("张三", 20, "教授", 8000);
        if ("教授".equals(teacher.getPost())) {
            Professor professor = (Professor) teacher;
            professor.introduce();
        }

    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("姓名：" + name + " 年龄：" + age + " 职称：" + post + " 薪水：" + salary);
    }
}

class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public void introduce() {
        System.out.println("姓名：" + getName() + " 年龄：" + getAge() + " 职称：" + getPost() + " 薪水：" + getSalary() * 1.3);
    }
}

class Professor1 extends Teacher {
    public Professor1(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("姓名：" + getName() + " 年龄：" + getAge() + " 职称：" + getPost() + " 薪水：" + getSalary() * 1.2);
    }
}

class Professor2 extends Teacher {
    public Professor2(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("姓名：" + getName() + " 年龄：" + getAge() + " 职称：" + getPost() + " 薪水：" + getSalary() * 1.1);
    }
}