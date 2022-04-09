package dsa;

public class GasStation {
    //LC 134
    public static void canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int tank = gas[i];
            int g = i, c = i;
            while (tank > 0) {
                if (c == cost.length) c = 0;
                if (g == gas.length) g = 0;
                tank += gas[++g] - cost[c++];
            }
        }
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        GasStation.canCompleteCircuit(gas, cost);
    }
}
