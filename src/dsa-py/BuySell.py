def get_max_profit(stock_prices):
    if len(stock_prices) < 2:
        return "Getting a profit requires at least 2 prices."

    min_price = stock_prices[0]
    max_profit = stock_prices[1] - stock_prices[0]

    for i in range(len(stock_prices)):
        current_price = stock_prices[i]
        potential_profit = current_price - min_price
        max_profit = max(max_profit, potential_profit)
        min_price = min(min_price, current_price)

    return max_profit


stock_prices = [10, 7, 5, 8, 11, 9]
max_profit = get_max_profit(stock_prices)
print(max_profit)
