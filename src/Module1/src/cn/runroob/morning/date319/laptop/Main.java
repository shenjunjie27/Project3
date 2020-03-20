package cn.runroob.morning.date319.laptop;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();

        USB usbMouse = new Mouse();
        laptop.useDvice(usbMouse);

        Keyboard keyboard = new Keyboard();
        laptop.useDvice(keyboard);

        laptop.powerOff();
    }
}
