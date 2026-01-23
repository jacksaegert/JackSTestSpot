
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //friendly user prompts
        System.out.println("Welcome to the Weekly Budget Tracker!");
        System.out.println("Please enter your weekly budget and daily spends. (Round to nearest dollar)");
        //Store user inputs
        System.out.print("Enter your Weekly Budget: ");
        int weeklyBudget = scanner.nextInt();
        int[] dailySpends = new int[7];
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //Get money for each dayT
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter money spent on " + days[i] + ": ");
            dailySpends[i] = scanner.nextInt();
        }
        //Close scanner to prevent memory leak
        scanner.close();
        //Output / Result calcualtions
        Budget budget = new Budget(weeklyBudget, dailySpends);
        System.out.println("\n" + budget.toString());
    }
}
