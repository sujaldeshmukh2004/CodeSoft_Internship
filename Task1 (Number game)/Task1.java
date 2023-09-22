import java.util.Random;
import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;  // Genrate a number b/w 1 - 100
        int maxAttempts = 5;    // life line , Only 5 Chance
        int attempts = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("!! Welcome To The Number Guessing Game !!");
        System.out.println("---------------------------------------------");
        System.out.println("Here are the Rules of the Game\nYou will get 5 Life Line , to Guess right answer to win or you wil lose the Game.");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println( );
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess Number : ");
            int guess = scanner.nextInt();
             
           // check the guess number and random number same or not . 
            
            if (guess == randomNumber) {
                System.out.println();
                System.out.println("!! Congratulations !! ");
                System.out.println("You guessed the right number : "+ randomNumber);
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is smaller than the actual number.");
            } else {
                System.out.println("Your guess is larger than the actual number.");
            }
            
            attempts++;
            int remainingAttempts = maxAttempts - attempts;
            System.out.println("Attempts left: " + remainingAttempts);
            
            if (remainingAttempts == 0) {

                System.out.println(" ");
                System.out.println("Game Over..!");
                System.out.println("Sorry , you have run out of attempts!");
                System.out.println("The actual number was: " + randomNumber);
            }
            System.out.println(" ");
        }
        
        scanner.close();
    }
}