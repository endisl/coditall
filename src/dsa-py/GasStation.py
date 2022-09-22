def can_complete_circuit(gas, cost):
    diff = tank = start = 0
    n = len(gas)

    for i in range(n):
        tank += gas[i] - cost[i]
        diff += gas[i] - cost[i]
        if tank < 0:
            tank = 0
            start = i+1

    return start if diff >= 0 else -1


gas = [1, 2, 3, 4, 5]
cost = [3, 4, 5, 1, 2]

starting_gas = can_complete_circuit(gas, cost)
print(starting_gas)
