package cn.runroob.morning.date319;

public interface Interface1 {
    public abstract void method1();

    public static void method2() {
        System.out.println("静态方法");
        System.out.print("静态方法调用");
        method5();
    }

    public default void method3() {
        System.out.println("默认方法");
        System.out.print("默认方法调用");
        method4();
        System.out.print("默认方法调用");
        method5();
    }

    private void method4() {
        System.out.println("私有方法");
    }

    private static void method5(){
        System.out.println("私有静态方法");
    }
}
