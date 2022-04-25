package dsa;

import java.util.Arrays;

public class WaterArea {
    //O(n) time | O(n) space
    public static int waterArea(int[] heights) {
        //edge case
        if (heights.length == 0)
            return 0;

        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];
        //int[] water = new int[heights.length];

        int currentMax = 0;
        for (int i = 1; i < heights.length; i++) {
            int newMax = heights[i-1];
            currentMax = Math.max(currentMax, newMax);
            leftMax[i] = currentMax;
        }

        currentMax = 0;
        for (int i = heights.length - 2; i >= 0; i--) {
            int newMax = heights[i+1];
            currentMax = Math.max(currentMax, newMax);
            rightMax[i] = currentMax;
        }

        int surfaceArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            if (heights[i] < minHeight)
               surfaceArea += minHeight - heights[i];
        }

        return surfaceArea;
    }

    public static void main(String[] args) {
        int[] heights = {0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3};
        var result = WaterArea.waterArea(heights);
        System.out.println(result);

        /*
        leftMax   = { 0,  0,  8,  8,  8,  8,  8, 8, 10, 10, 10, 10, 10, 10}
        righttMax = {10, 10, 10, 10, 10, 10, 10, 3,  3,  3,  3,  3,  3,  0}
        water     = { 0,  0,  8,  8,  3,  8,  8, 0,  3,  3,  2,  2,  3,  0} = 48
         */
    }
}
