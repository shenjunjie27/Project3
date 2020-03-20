package cn.runroob.morning.date320;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("林娜琏");
        System.out.println(sb1);
        sb1.append("是TWICE的一员");
        System.out.println(sb1);
        sb1.append(",并且还没有flop");
        System.out.println(sb1);
        sb1.delete(12,sb1.length());//删除数据，左闭右开
        System.out.println(sb1);
        int i= 1;
        String str=i+"";
        System.out.println(str);
    }
}
