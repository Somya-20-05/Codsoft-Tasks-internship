import java.util.Scanner;

public class Task4CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.println("Supported Currencies: USD, INR, EUR, GBP");
        
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        
        System.out.print("From currency (USD/INR/EUR/GBP): ");
        String from = sc.next().toUpperCase();
        
        System.out.print("To currency (USD/INR/EUR/GBP): ");
        String to = sc.next().toUpperCase();
        
        double convertedAmount = convertCurrency(amount, from, to);
        
        if (convertedAmount >= 0) {
            System.out.printf("%.2f %s = %.2f %s\n", amount, from, convertedAmount, to);
        } else {
            System.out.println("Invalid currency entered!");
        }
        
        sc.close();
    }
    
    public static double convertCurrency(double amount, String from, String to) {
        // Exchange rates (example rates)
        double usdToInr = 83.0;
        double usdToEur = 0.93;
        double usdToGbp = 0.82;
        
        double inrToUsd = 1 / usdToInr;
        double eurToUsd = 1 / usdToEur;
        double gbpToUsd = 1 / usdToGbp;
        
        double amountInUsd = 0;
        
        // Convert from source to USD first
        switch (from) {
            case "USD": amountInUsd = amount; break;
            case "INR": amountInUsd = amount * inrToUsd; break;
            case "EUR": amountInUsd = amount * eurToUsd; break;
            case "GBP": amountInUsd = amount * gbpToUsd; break;
            default: return -1;
        }
        
        // Convert from USD to target currency
        switch (to) {
            case "USD": return amountInUsd;
            case "INR": return amountInUsd * usdToInr;
            case "EUR": return amountInUsd * usdToEur;
            case "GBP": return amountInUsd * usdToGbp;
            default: return -1;
        }
    }
}
