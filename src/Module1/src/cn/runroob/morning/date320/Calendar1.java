package cn.runroob.morning.date320;

import java.util.Calendar;
import java.util.Date;

/*
1.Calendar类中的getTime方法不同与Date中是获取毫秒时刻，而是返回一个Date对象
2.Calendar类中，月份是从0开始的，所以在使用时，最好别忘了+1
*/

public class Calendar1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1989);//把cal对象里的时间改为了1989
        //把cal对象里的年份数据赋值给year
        //cal.add(Calendar.YEAR,-8);
        int year = cal.get(Calendar.YEAR);
        // 设置月
        int month = cal.get(Calendar.MONTH) + 1;
        // 设置日
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        Date date = cal.getTime();
        System.out.println(date);
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日"); // 2020年1月17日
    }
}
