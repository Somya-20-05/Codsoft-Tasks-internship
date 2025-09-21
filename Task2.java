import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 3 subjects:");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        int total = sub1+sub2+sub3;
        double average = total / 3.0;
        String grade;

        if(average >= 90) grade = "A+";
        else if(average >= 75) grade = "A";
        else if (average >= 60) grade ="A";
        else if (average >= 50) grade = "C";
        else grade = "F";

        System.out.println("total:" + total);
        System.out.println("Average: " + average);
        System.out.println("Grade:" + grade);
        sc.close();
    }
    
}
