public class p121_MaxProfitCalculator {

    // Method to calculate the maximum profit
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, profit = 0;

        for (int price : prices) {
            if (price < buy) buy = price;
            profit = Math.max(profit, price - buy);
        }
        return profit;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Sample test cases
        int[] test1 = {7, 1, 5, 3, 6, 4};
        int[] test2 = {7, 6, 4, 3, 1};
        int[] test3 = {1, 2, 3, 4, 5};
        int[] test4 = {5, 4, 3, 2, 1};

        // Running test cases and printing results
        System.out.println("Maximum profit for test1: " + maxProfit(test1)); // Expected: 5
        System.out.println("Maximum profit for test2: " + maxProfit(test2)); // Expected: 0
        System.out.println("Maximum profit for test3: " + maxProfit(test3)); // Expected: 4
        System.out.println("Maximum profit for test4: " + maxProfit(test4)); // Expected: 0
    }
}
