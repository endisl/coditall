package dsa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 9, 11, 18, 20, 21, 24, 30};
        var index = JumpSearch.search(arr, 6);
        System.out.println(index);

        //Insertion Sort
        /*int[] arr = {8, 2, 4, 1, 3, 1};
        var sorter = new InsertionSort();
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));*/
    }
}
