package 作业.chapter10面向对象高级;

public class HomeWork08 {
    public static void main(String[] args) {
        Color color = Color.BLACK;
        switch (color){
            case RED:
            case YELLOW:
            case BLACK:
            case BLUE:
            case GREEN:
                color.show();
                break;
        }
    }
}
enum Color implements Test{
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0);
    private int reaValue;
    private int greenValue;
    private int blueValue;

    Color(int reaValue, int greenValue, int blueValue) {
        this.reaValue = reaValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(reaValue + " " + blueValue + " " +greenValue);
    }
}
interface Test{
    void show();
}