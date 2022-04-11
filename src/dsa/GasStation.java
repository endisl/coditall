package dsa;

public class GasStation {
    //LC 134

    //v.2.0
    // O(n) time | O(1) space
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0, n = gas.length;
        int tank = 0, start = 0;
        for (int i = 0; i < n; i++) {
            tank += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (tank < 0) {
                tank = 0;
                start = i+1;
            }
        }
        return sum >= 0 ? start : -1;
    }

    //v.1.0
    //O(n²) time | O(1) space
    /*public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int tank = gas[i] - cost[i];
            if (tank >= 0 && gas.length == 1 && cost.length == 1) return i;
            int g = i+1, c = i+1;
            int count = 1;
            while (tank >= 0) {
                if (c == cost.length) c = 0;
                if (g == gas.length) g = 0;
                tank += gas[g++] - cost[c++];
                count++;
                if (tank >= 0 && count == gas.length) return i;
            }
        }
        return -1;
    }*/

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int startingGas = GasStation.canCompleteCircuit(gas, cost);
        System.out.println(startingGas);
    }  //v.1.0
       //TLE for a huge array on Leetcode | 34/37 test cases passed.
}
