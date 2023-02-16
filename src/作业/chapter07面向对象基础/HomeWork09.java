package 作业.chapter07面向对象基础;

public class HomeWork09 {
    public static void main(String[] args) {
        Music music = new Music("青花瓷",5.0);
        System.out.println(music.getInfo() + " " + music.play());
    }
}
class Music{
    String name;
    double times;
    public Music(String name, double times) {
        this.name = name;
        this.times = times;
    }
    public String play(){
        return "开始播放！";
    }
    public String getInfo(){
        return "音乐名：" + name +" "+ "时长：" + times;
    }
}