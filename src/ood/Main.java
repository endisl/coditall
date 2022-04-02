package ood;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 1, 3, 1};
        var sorter = new InsertionSort();
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
