package 数组;

import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        int [] arr={22,4,67,7,89,34,45,24,567,4,6,7,55,67};
        int searchWord=34;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(searchWord+"元素的索引："+binarySearch(arr,searchWord));
    }
    public static int binarySearch(int[] array,int value){
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int middle=(low+high)/2;
            if(value==array[middle]){
                return middle;
            }
            if(value>array[middle]){
                low=middle+1;
            }
            if(value<array[middle]){
                high=middle-1;
            }
        }
        return -1;
    }
}
