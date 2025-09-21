import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100)+1;
        int attempts = 0,guess;


        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number betwwn 1 and 100");

        while (true) {
           System.out.println("Enter your guess:");
           guess = sc.nextInt() ;
           attempts++;

           if(guess == number){
            System.out.println("Correct! you guessed in" + attempts +"attempts.");
            break;
           } else if(guess < number){
            System.out.println("Too low!");
           } else {
            System.out.println("Too high!");
           }

        }
        sc.close();
    }
    
}
