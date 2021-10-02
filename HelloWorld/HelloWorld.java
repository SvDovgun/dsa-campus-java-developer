import java.util.Random;
import java.util.Scanner;

class HelloWorld {
	public static void main(String[] args){
		
		Random rando = new Random();
		int secretNumber = rando.nextInt(100); 
		System.out.println(secretNumber);
		System.out.println("Hello! Lets play a game. We have the secret number. Please try to guess it");
		
		Scanner scanner = new Scanner(System.in);
			
		boolean guessed = false;
		while (guessed == false) {
			String line = scanner.nextLine();
			int userValue = Integer.parseInt(line);
			if (userValue > secretNumber){
				System.out.println("No, the secret number is less than your's one " + userValue );
				System.out.println("Please. Try again");					
			} if (userValue < secretNumber) {
				System.out.println("No, the secret number is bigger than your's one " + userValue);	
				System.out.println("Please. Try again");
			} if (userValue == secretNumber) {
				System.out.println("Congratulation! You guested the Secret Number. Yes, it was " + secretNumber);
				guessed = true;
			} 			
		
		}
		
		//int value; //declare
		//value = 10 ; // initialization		
		//long longValue = value; // declare &  unit
		//System.out.print("Value = ");
		//System.out.println(value);		
		//System.out.println("Long value = " + longValue);		// concatunation
		//System.out.println(10/3); //3
		//System.out.println(1/3);  //0
		//System.out.println(10 % 3); // 1; 10 = 3*3 +1
		//System.out.println(1 % 3); // 1; 1 = 0*3 +1
		//int value3 = 12;
		//while (value3 % 5 != 0) {
		//	System.out.println(value3);
		//	value3++;
		//}	
		
	}
}