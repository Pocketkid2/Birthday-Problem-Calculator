import java.util.*;

/**
 * Write a description of class BirthdayProblemMain here.
 * 
 * @author Adam
 * @version 1.0
 */
public class BirthdayProblemMain
{
    public static void main(String[] args) {
        // Display instructions
        System.out.println("Please type the number of people in the room");
        
        // Create the input scanner
        Scanner s = new Scanner(System.in);
        
        // Get the number
        int people = s.nextInt();
        
        // Do calculations
        double percentage = BirthdayProblemMain.calculate(people);
        
        // Display it
        System.out.println("The chance that at least two of the " + people + " people share the same birthday is " + percentage + "%");
    }
    
    // Calculatest the percentage probability that any two people have the same birthday
    private static double calculate(int people) {
        // Check for underflow
        if (people < 2) {
            return 0;
        }
        // Check for overflow
        if (people > 366) {
            return 100;
        }
        System.out.println("People: " + people);
        // Create a total
        double total = 1.0;
        
        System.out.println("Total: " + total);
        
        // Continuously multiply into it
        for (double i = 1.0; i < people; i++) {
            System.out.println("BEFORE STEP");
            System.out.println("i = " + i);
            total *= (366.0 - i) / 366.0;
            System.out.println("AFTER STEP");
            System.out.println("total = " + total);
        }
        
        // Now subtract it from one to get the real answer
        double answer = 1.0 - total;
        
        System.out.println("answer = " + answer);
        
        // Now convert up and round, then down to percent
        answer *= 10000;
        answer = Math.round(answer);
        answer /= 100.0;
        System.out.println("answer = " + answer);
        return answer;
    }
}
