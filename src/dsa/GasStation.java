package dsa;

public class GasStation {
    //LC 134
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int tank = gas[i] - cost[i];
            int g = i+1, c = i+1;
            int count = 1;
            while (tank >= 0) {
                if (c == cost.length) c = 0;
                if (g == gas.length) g = 0;
                tank += gas[g++];
                tank -= cost[c++];
                count++;
                if (tank >= 0 && count == gas.length) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int startingGas = GasStation.canCompleteCircuit(gas, cost);
        System.out.println(startingGas);
    }  //v.1.0
}
