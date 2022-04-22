package dsa;

import java.util.ArrayList;

public class StaircaseTraversal {
    /* 4 solutions:
    Recursion -> O(k^n) time | O(n) space
    Recursion with Memoization -> O(n*k) time | O(n) space
    Dynamic Programming (iterative approach of the above) -> O(n*k) time | O(n) space
    Sliding Window -> O(n) time | O(n) space
    where n:height | k: allowed steps(number of "+" operations) */

    //Sliding Window
    public static int numberOfWays(int height, int maxSteps) {
        int currentNumberOfWays = 0;
        ArrayList<Integer> waysToTop = new ArrayList<>();
        waysToTop.add(1);

        for (int currentHeight = 1; currentHeight <= height; currentHeight++) {
            int startOfWindow = currentHeight - maxSteps - 1;
            int endOfWindow = currentHeight - 1;

            if (startOfWindow >= 0)
                currentNumberOfWays -= waysToTop.get(startOfWindow);

            currentNumberOfWays += waysToTop.get(endOfWindow);
            waysToTop.add(currentNumberOfWays);
        }
        return waysToTop.get(height);
    }

    public static void main(String[] args) {
        System.out.println(StaircaseTraversal.numberOfWays(10,2));
        //output: 89
    }
}
