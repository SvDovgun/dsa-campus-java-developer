import java.util.Random;
import java.util.Scanner;

class GameOne {
	public static void main(String[] args){
		
		Random rando = new Random();
		int secretNumber = rando.nextInt(100); 
		//System.out.println(secretNumber);
		System.out.println("Hello! Lets play a game. We have the secret number. Please try to guess it");
		
		Scanner scanner = new Scanner(System.in);
			
		boolean guessed = false;
		while (guessed == false) {
			String line = scanner.nextLine();
			int userValue = Integer.parseInt(line);
			if (userValue > secretNumber){
				System.out.println("No, the secret number is LESS than your's one " + userValue );
				System.out.println("Please. Try again");					
			} if (userValue < secretNumber) {
				System.out.println("No, the secret number is BIGGER than your's one " + userValue);	
				System.out.println("Please. Try again");
			} if (userValue == secretNumber) {
				System.out.println("Congratulation! You guested the Secret Number. Yes, it was " + secretNumber);
				guessed = true;
			} 			
		
		}
		
		
	}
}