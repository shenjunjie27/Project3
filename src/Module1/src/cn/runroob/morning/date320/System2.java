package cn.runroob.morning.date320;

public class System2 {
    public static void main(String[] args) {
        int[] src={1,2,3,4,5};
        int[] dest={6,7,8,9,10};
        System.arraycopy(src,0,dest,2,3);
        //将第一个数组的0号索引开始的3个数据替代第二个数组的2号开始的三个数据
        for (int i = 0; i < src.length; i++) {
            System.out.print(src[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i]+" ");
        }
    }
}
