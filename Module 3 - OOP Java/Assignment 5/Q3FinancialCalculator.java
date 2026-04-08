import java.util.*;

public class Q3FinancialCalculator {

    public static <T extends Number> void calculate(List<T> data) {
        double sum = 0;

        for (T num : data) {
            sum += num.doubleValue();
        }

        double avg = sum / data.size();

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer transactions
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        List<Integer> transactions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            transactions.add(sc.nextInt());
        }

        // Double salaries
        System.out.print("Enter number of salaries: ");
        int m = sc.nextInt();
        List<Double> salaries = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            salaries.add(sc.nextDouble());
        }

        System.out.println("\nTransactions:");
        calculate(transactions);

        System.out.println("\nSalaries:");
        calculate(salaries);
    }
}