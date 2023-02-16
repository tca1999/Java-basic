package 作业.chapter08面向对象中级;

public class HomeWork09 {
    public static void main(String[] args) {
        LabeledPoint labeledPoint = new LabeledPoint("Black", 1929, 230.07);
        System.out.println(labeledPoint);
    }
}
class Point{
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
class LabeledPoint extends Point{
    private String label;

    public LabeledPoint(String label,double x, double y) {
        super(x, y);
        this.label = label;
    }
}