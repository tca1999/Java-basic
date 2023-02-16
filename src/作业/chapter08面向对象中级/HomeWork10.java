package 作业.chapter08面向对象中级;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("张三", 20, "医生", '男', 5000);
        Doctor doctor1 = new Doctor("张三", 20, "医生", '男', 5000);
        Doctor doctor2 = new Doctor("张三", 20, "医生", '男', 5001);
        System.out.println(doctor.equals(doctor1));
        System.out.println(doctor.equals(doctor2));
    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Doctor){
            Doctor doctor = (Doctor) obj;
            return this.name.equals(doctor.name) && this.age == doctor.age && this.gender == doctor.gender && this.job.equals(doctor.job) && this.sal == doctor.sal;
        }
        return false;
    }
}