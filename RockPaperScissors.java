import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Define the possible choices
        String[] choices = { "rock", "paper", "scissors" };

        // Prompt the user to make a choice
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        // Generate a random choice for the computer
        Random random = new Random();
        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];

        // Display the choices made by the user and the computer
        System.out.println("Your choice: " + userChoice);
        System.out.println("Computer's choice: " + computerChoice);

        // Determine the winner
        String result;
        if (userChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else if (userChoice.equals("rock")) {
            if (computerChoice.equals("paper")) {
                result = "Computer wins!";
            } else {
                result = "You win!";
            }
        } else if (userChoice.equals("paper")) {
            if (computerChoice.equals("scissors")) {
                result = "Computer wins!";
            } else {
                result = "You win!";
            }
        } else if (userChoice.equals("scissors")) {
            if (computerChoice.equals("rock")) {
                result = "Computer wins!";
            } else {
                result = "You win!";
            }
        } else {
            result = "Invalid choice. Please choose rock, paper, or scissors.";
        }

        // Display the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
