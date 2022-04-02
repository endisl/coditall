package ood;

public class InsertionSort {
    public void sort(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            var current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}
