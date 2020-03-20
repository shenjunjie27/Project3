package cn.runroob.morning.date319.laptop;

public class Laptop {
    public void powerOn() {
        System.out.println("打开电脑");
    }

    public void powerOff() {
        System.out.println("关闭电脑");
    }

    public void useDvice(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {
            ((Mouse) usb).click();
        }
        if (usb instanceof Keyboard) {
            ((Keyboard) usb).type();
        }
        usb.close();
    }
}
