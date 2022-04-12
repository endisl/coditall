package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    //naive approach -> O(n^3) time | O(1) space
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length; i++) {
            int num1 = array[i];
            for (int j = i+1; j < array.length; j++) {
                int num2 = array[j];
                for (int k = j+1; k < array.length; k++) {
                    int num3 = array[k];
                    if (num1 + num2 + num3 == targetSum)
                        result.add(new Integer[] {num1, num2, num3});
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {12, 3, 1, 2, -6, 5, -8, 6};
        var result = ThreeSum.threeNumberSum(input, 0);
        for (var array : result) {
            System.out.println(Arrays.toString(array));
        }
    }
}
