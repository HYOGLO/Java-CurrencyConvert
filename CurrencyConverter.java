import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] exchangeRate = {0.79, 0.93, 149.31, 19.13, 1.35};
        System.out.println("Please enter the amount in US dollar: ");
        double usDollar = scan.nextDouble();

        System.out.println("Converting to other currencies!");

        System.out.println("currency\t\t\tamount");
        System.out.println("------------------------------------------");

        String[] currencies = {"English Pound", "Euro", "Japanese Yen", "South African Rand", "Canadian Dollar"};
        for (int i = 0; i < exchangeRate.length; i++) {
            double converted = usDollar * exchangeRate[i];
            System.out.printf("%-24s\t%.2f\n", currencies[i], converted);
        }

        scan.close();
    }
}
