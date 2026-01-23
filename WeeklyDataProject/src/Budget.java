/**
 * Represents a weekly budget tracker that analyzes daily spending across seven days.
 * This class provides methods to calculate total spending, remaining budget, and insights
 * into spending patterns, such as the day with the highest and lowest expenditures.
 * It also offers feedback on whether the budget has been exceeded.
 * Author: Jack S.
 * Co-Author: Minimax-2.1 (JavaDoc comments)
 */
public class Budget {
    /** The total weekly budget amount in dollars. */
    private int weeklyBudget;
    /** Array of daily spending amounts for each day of the week (Monday to Sunday). */
    private int[] dailySpends = new int[7];
    /** Array of day names corresponding to the dailySpends indices. */
    private String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    /**
     * Constructs a Budget object with the specified weekly budget and daily spending data.
     * @param weeklyBudget the total budget for the week
     * @param dailySpends an array of 7 integers representing spending for each day (Monday to Sunday)
     */
    public Budget(int weeklyBudget, int[] dailySpends) {
        this.weeklyBudget = weeklyBudget;
        this.dailySpends = dailySpends;
    }

    /**
     * Calculates the total amount spent across all seven days.
     * @return the sum of all daily spends
     */
    private int getTotalSpent() {
        int total = 0;
        for (int spend : dailySpends) {
            total += spend;
        }
        return total;
    }

    /**
     * Computes the remaining budget by subtracting total spent from the weekly budget.
     * @return the difference between weekly budget and total spent (can be negative if over budget)
     */
    private int getRemainingBudget() {
        return weeklyBudget - getTotalSpent();
    }

    /**
     * Identifies the day of the week with the highest spending.
     * @return the name of the day with the maximum spend
     */
    private String getSpendiestDay() {
        int maxSpend = dailySpends[0];
        int dayIndex = 0;
        for (int i = 1; i < dailySpends.length; i++) {
            if (dailySpends[i] > maxSpend) {
                maxSpend = dailySpends[i];
                dayIndex = i;
            }
        }
        return days[dayIndex];
    }

    /**
     * Identifies the day of the week with the lowest spending.
     * @return the name of the day with the minimum spend
     */
    private String getSaviestDay() {
        int minSpend = dailySpends[0];
        int dayIndex = 0;
        for (int i = 1; i < dailySpends.length; i++) {
            if (dailySpends[i] < minSpend) {
                minSpend = dailySpends[i];
                dayIndex = i;
            }
        }
        return days[dayIndex];
    }

    /**
     * Checks if the total spending exceeds the weekly budget.
     * @return true if over budget, false otherwise
     */
    private boolean isOverBudget() {
        return getTotalSpent() > weeklyBudget;
    }

    /**
     * Calculates the average daily spending, rounded to two decimal places.
     * @return the average spend per day
     */
    private double getAverageDailySpend() {
        return Math.round((double) getTotalSpent() / dailySpends.length * 100.0) / 100.0;
    }

    /**
     * Returns a string representation of the budget summary, including total spent,
     * remaining budget, spending insights, and feedback on budget adherence.
     * @return a formatted string with budget details and analysis
     * (Ai helped me with the Tertiary Operator below)
     */
    @Override
    public String toString() {
        return "Weekly Budget: $" + weeklyBudget + "\n" +
               "Total Spent: $" + getTotalSpent() + "\n" +
               "Remaining Budget: $" + getRemainingBudget() + "\n" +
               "Spendiest Day: " + getSpendiestDay() + "\n" +
               "Saviest Day: " + getSaviestDay() + "\n" +
               "Average Daily Spend: $" + getAverageDailySpend() + "\n" +
               "Feedback: " + (isOverBudget() ? "You have exceeded your budget. Consider reviewing your expenses." : "Great job staying within your budget!");
    }


}
