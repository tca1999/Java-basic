package chapter10面向对象高级.接口;

public class Computer {
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.stop();
    }

}
