package cn.runroob.morning.date319;

public class Muti {
    public static void main(String[] args) {
        Fu obj = new Zi();//多态
        //左侧父类的引用指向左边子类的对象
        obj.method();
        obj.methodFu();
        System.out.println(obj.num);
        //Zi Son=(Zi)obj;
        //Son.method();
//        SiShengZi son = (SiShengZi)obj;//类转换类型出错
//        obj.method();
    }
}
