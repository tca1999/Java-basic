package chapter12异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public void f2() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("d://");
    }
}
