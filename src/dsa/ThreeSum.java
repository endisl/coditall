package dsa;

import java.util.List;

public class ThreeSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        for (int i = 0; i<array.length; i++) {
            int num1 = array[i];
            for (int j = 0; i<array.length; i++) {
                int num2 = array[j];
                for (int k = 0; i<array.length; i++) {
                    int num3 = array[k];
                    if (num1 + num2 + num3 == targetSum)

                }

            }

        }


    }

    public static void main(String[] args) {
        int[] input = {12, 3, 1, 2, -6, 5, -8, 6};
        var result = ThreeSum.threeNumberSum(input, 0);
        System.out.println(result);
    }
}
