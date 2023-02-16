package chapter11枚举和注解;

/*
1) 使用 enum 关键字后，就不能再继承其它类了，因为 enum 会隐式继承 Enum，而 Java 是单继承机制。
2) 枚举类和普通类一样，可以实现接口，如下形式。
enum 类名 implements 接口 1，接口 2{}
 */
public class EnumDetail {
    public static void main (String[] args) {
        Music.CLASSICMUSIC.playing();
    }
}

//1.使用 enum 关键字后，就不能再继承其它类了，因为 enum 会隐式继承 Enum，而 Java 是单继承机制
//enum Season3 extends A {
//
//}
//2.enum 实现的枚举类，仍然是一个类，所以还是可以实现接口的.
interface IPlaying {
    public void playing();
}

enum Music implements IPlaying {
    CLASSICMUSIC;

    @Override
    public void playing() {
        System.out.println("播放好听的音乐...");
    }
}