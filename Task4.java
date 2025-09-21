import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "Q1.What is the capital of India?",
            "Q2.Who is the father of java?",
            "Q3.Which type of data type for true/false?",
            "Q4.Java developed by?",
            "Q5.Keyword to inherit a class?"
        };
        String[][] options ={
            {"1.Delhi","2.Mumbai","3.kolkata","4.chennai"},
            {"1.Jmaes Gosling" , "2.Dennis Ritchie" , "3.Bjarne Stroustrup" , "4,Guido van Rossum"},
            {"1.int" ,"2.boolean" , "3.String","4.char"},
            {"1.Microsoft" , "2.Sum Microsystem","3.Google","4.Oracle"},
            {"1.this", "2.super","3.extends","4.implements"}
        };
        int[] answers = {1,1,2,2,3};
        int score = 0;

        System.out.println("===== Quiz Time!=====");

        for(int i =0;i<questions.length;i++){
            System.out.println("\n" + questions[i]);
            for(String opt : options[i]) System.out.println(opt);
            System.out.println("Enter option number:");
            int userAns = sc.nextInt();
            if(userAns == answers[i]){
                System.out.println("Correct!");
                score++;
            } else{
                System.out.println("Wrong!");
            }
        }

        System.out.println("\nyour Score:" + score + "/n"+ questions.length);
        if(score>=4)System.out.println("Excellent");
        else if(score>=2) System.out.println("Good, can improve!");
        else System.out.println("Better luck next time!");
        sc.close();
    }
    
}
