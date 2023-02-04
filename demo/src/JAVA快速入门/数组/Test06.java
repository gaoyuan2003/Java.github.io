package 数组;

import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {
        int[] a={89,45,6,2,704,62,22,408,999};
        System.out.print(Arrays.toString(a)+"\t");
        Arrays.sort(a);
        System.out.println();
        System.out.print(Arrays.toString(a)+"\t");
        System.out.println();
        System.out.println("该元素的索引："+Arrays.binarySearch(a,62));
    }
}
