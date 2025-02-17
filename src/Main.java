package problema3;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, income, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                taxPayers.add(new Company(name, income, employees));
            }
        }

        System.out.println("\nTAXES PAID:");
        double totalTaxes = 0.0;
        for (TaxPayer tp : taxPayers) {
            double tax = tp.calculateTax();
            totalTaxes += tax;
            System.out.printf("%s: $ %.2f%n", tp.getName(), tax);
        }

        System.out.printf("\nTOTAL TAXES: $ %.2f%n", totalTaxes);

        sc.close();
    }
}

