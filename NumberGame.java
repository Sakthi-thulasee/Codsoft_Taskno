import java.util.Random;
import java.util.Scanner;
class Game 
{
	Scanner s=new Scanner(System.in);
	public void play()
	{
		Random random = new Random();
        	 boolean playAgain = true;
        	 while (playAgain) 
		{
            		int numberToGuess = random.nextInt(100) + 1; //Random number Generation
            		int attempts = 0;
            		int userGuess = 0;
            		int maxAttempts = 5; // Attempts for your guess
            	        System.out.println("Welcome to the Number Game!");
           		System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");
            
            		while (attempts < maxAttempts) 
			{
               			System.out.print("Enter your guess: ");
                		userGuess = s.nextInt();
                		attempts++;
                
                		if (userGuess == numberToGuess) 
				{
                    		System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    		break;
                		} 
				else if (userGuess > numberToGuess) 
				{
                    			System.out.println("Too high! Try again.");
               		        } 
				else
				{
                   			 System.out.println("Too low! Try again.");
                		}
            		}
			
           		 if (userGuess != numberToGuess) 
			{
               				 System.out.println("Sorry! You've used all attempts. The number was: " + numberToGuess);
           		 }

           		 System.out.print("Do you want to play again? (yes/no): ");
           		 String response = s.next();
            		 playAgain = response.equalsIgnoreCase("yes");
		}
	}
}
public class NumberGame
{
	public static void main(String args[])
	{
		Game g=new Game();
		g.play();
	}
}
		
		
		