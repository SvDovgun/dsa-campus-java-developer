import java.util.Random;
import java.util.Scanner;

class GameTwo {
	public static void main(String[] args){
			
		System.out.println("Hello! Lets play a game. Please make a guess the secret number (from 1 to 100). Computer will try to guess it. Press any number for start");
		
		int compRandomNumber;
		int minBoarder=1;
		int maxBoarder=100;
				
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		char userValue = line.charAt(0);
		
		Random random = new Random();
		compRandomNumber = random.nextInt(maxBoarder - minBoarder + 1) + minBoarder*2; 

		int[] arrayNumbers = new int[30];
		int i = 1;
		
		
		boolean guessed = false;
		while (guessed == false) {
				
			System.out.println("Attempt #" + i + ". Is it " + compRandomNumber +"?" );
			arrayNumbers[i]= compRandomNumber;

			line = scanner.nextLine();
			userValue = line.charAt(0);
			if (userValue == '=' ){
					System.out.println("Great! Computer guested the your Secret Number on attempt #"+i+". Yes, it was " + compRandomNumber);
					guessed = true;
					break;
				
			} if (userValue == '>' ) {
				minBoarder = compRandomNumber ;
				//	System.out.println("minBoarder = " + minBoarder);
				//	System.out.println("maxBoarder = " + maxBoarder);
					
			} if (userValue == '<' ) {
				maxBoarder = compRandomNumber ;
				//	System.out.println("minBoarder = " + minBoarder);
				//	System.out.println("maxBoarder = " + maxBoarder);
					
			}  
				//compRandomNumber = random.nextInt(maxBoarder - minBoarder) + minBoarder; 

				//System.out.println (" index" + indexOf(arrayNumbers, compRandomNumber));
			while ( indexOf(arrayNumbers, compRandomNumber) > 0) {
				compRandomNumber = random.nextInt(maxBoarder - minBoarder) + minBoarder;
			}
			i++;
			
		}
		
		
	}


	public static int indexOf(int[] array, int findElement){
		int result = -1;
		for(int i = 0; i < array.length ; i++){
			if (array[i] == findElement) {
				result = i;
			}			
		}	
		return result;
	}
}