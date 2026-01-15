public class Budget {
    private int weeklyBudget;
    private int[] dailySpends = new int[7];
    private String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public Budget(int weeklyBudget, int[] dailySpends) {
        this.weeklyBudget = weeklyBudget;
        this.dailySpends = dailySpends;
    }
    public static void getUserInfo() {
        // For future implementation
    }
    private int getTotalSpent() {
        int total = 0;
        for (int spend : dailySpends) {
            total += spend;
        }
        return total;
    }
    private int getRemainingBudget() {
        return weeklyBudget - getTotalSpent();
}
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
    private boolean isOverBudget() {
        return getTotalSpent() > weeklyBudget;
    }
    private String getSpenderClassification() {
        double averageSpend = (double) getTotalSpent() / dailySpends.length;
        double targetDailyBudget = (double) weeklyBudget / 7;
        if (isOverBudget()) {
            return "Splurger (Over Budget)";
        } else if (averageSpend < targetDailyBudget * 0.5) {
            return "Money Saver";
        } else if (averageSpend <= targetDailyBudget) {
            return "Steady Spender";
        } else {
            return "Other Spender";
        }
    }
    private double getAverageDailySpend() {
        return Math.round((double) getTotalSpent() / dailySpends.length * 100.0) / 100.0;
    }
    // write toString method
    @Override
    public String toString() {
        return "Weekly Budget: $" + weeklyBudget + "\n" +
               "Total Spent: $" + getTotalSpent() + "\n" +
               "Remaining Budget: $" + getRemainingBudget() + "\n" +
               "Spendiest Day: " + getSpendiestDay() + "\n" +
               "Saviest Day: " + getSaviestDay() + "\n" +
               "Average Daily Spend: $" + getAverageDailySpend() + "\n" +
               "Spender Classification: " + getSpenderClassification();
    }

    
}