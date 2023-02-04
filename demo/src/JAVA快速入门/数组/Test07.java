package 数组;

import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) {
        int[] a={89,45,6,2,704,62,22,408,999};
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,2,4,100);
        System.out.println(Arrays.toString(a));
    }
}
