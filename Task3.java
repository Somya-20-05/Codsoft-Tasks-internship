import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0;
        int choice;

        System.out.println("Welcome to Simple ATM");

        do{
            System.out.println("\n1.Check Balance\n2.Deposit\n3.Withdraw\n4.Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                   System.out.println("your balance:"+ balance);
                    
                    break;
                case 2:
                System.out.println("Enter amount to deposit:");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("Amount deposited. New balance:" + balance);
                break;
                case 3:
                System.out.println("Enter amount to withdraw:");
                double withdraw = sc.nextDouble();
                if(withdraw <= balance){
                    balance -= withdraw;
                    System.out.println("Withdraw successful. New balance:" + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;
                case 4:
                System.out.println("Thank you for using ATM.");
                break;
            
                default:
                  System.out.println("Invalid choice!");
                    
            }

        } while (choice != 4);

        sc.close();

    }
    
}
