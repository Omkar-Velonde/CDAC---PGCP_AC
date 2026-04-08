import java.util.*;

public class Q2ReportGenerator {

    public static <T> void generateReport(List<T> data) {
        System.out.println("\n--- Report ---");
        for (T item : data) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sales Data
        System.out.print("Enter number of sales records: ");
        int n = sc.nextInt();
        List<Double> sales = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sales.add(sc.nextDouble());
        }

        // Employee Names
        sc.nextLine();
        System.out.print("Enter number of employees: ");
        int m = sc.nextInt();
        sc.nextLine();

        List<String> names = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            names.add(sc.nextLine());
        }

        // Product IDs
        System.out.print("Enter number of product IDs: ");
        int p = sc.nextInt();

        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            ids.add(sc.nextInt());
        }

        generateReport(sales);
        generateReport(names);
        generateReport(ids);
    }
}