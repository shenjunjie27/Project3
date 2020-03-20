package cn.runroob.morning.date319;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
             arr.add(new Random().nextInt(100)+1);
            //System.out.print("请输入第"+(i+1)+"个数:");
            //arr.add(new Scanner(System.in).nextInt());
        }
        System.out.print("快排之前的集合为:"+arr+"\n");

        quickSort(arr, 0, arr.size() - 1);
        System.out.println("快排之后的集合为:"+arr+"\n");
//        int[] nums = {1, 3, 4, 9, 8, 0, -9};
//        quickSort(nums, 0, nums.length - 1);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
    }

    //快排 集合实现 ArrayList
    public static void quickSort(ArrayList<Integer> arr, int low, int high) {
        int i, j, key, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        key = arr.get(low);
        while (i < j) {
            while (key <= arr.get(j) && i < j)
                j--;
            while (key >= arr.get(i) && i < j)
                i++;
            if (i < j) {
                t = arr.get(j);
                arr.set(j, arr.get(i));
                arr.set(i, t);
            }
        }
        arr.set(low, arr.get(i));
        arr.set(i, key);
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

}
