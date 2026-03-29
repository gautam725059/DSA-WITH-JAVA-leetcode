public class gasStation {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        System.out.println(sol.canCompleteCircuit(gas, cost));
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, tank = 0, startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            if (tank < 0) {
                startIndex = i + 1;
                tank = 0;
            }
        }

        return totalGas < totalCost ? -1 : startIndex;
    }
}