package cn.runroob.morning.date320;

import java.util.Date;

public class System1 {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
//        Date date = new Date();
        long time2 = new Date().getTime();
        //上述两种方法都可以获取当前的毫秒数，不过
        //我个人猜测，应该是第一种方法效率会高一些
        System.out.println(time1);
        System.out.println(time2);
        long timeBegin = new Date().getTime();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        long timeEnd = new Date().getTime();



        long timeBegin2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000 ; i++) {
            System.out.println(i);
        }
        long timeEnd2 = System.currentTimeMillis();

        System.out.println("1方法共耗时毫秒： " + (timeEnd - timeBegin));
        System.out.println("2方法共耗时毫秒： " + (timeEnd2 - timeBegin2));
    }
}
