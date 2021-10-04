class Triangles {

	public static void main (String[] args){
		System.out.println("Triangle 1 ");
		// for (init; condition; operation)
		for (int i = 0; i < 3 ; i++){
			for (int j = 0; j < 3 ; j++){
				if (i >= j){
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		/*Triangle 1
		*
		**
		***
		*/
		
		System.out.println("Triangle 2 ");
		// for (init; condition; operation)
		for (int i = 0; i < 3 ; i++){
			for (int j = 0; j < 3 ; j++){
				if (i>j){
					System.out.print(" ");
				}else {System.out.print("*");}
			}
			System.out.println("");
		}
		/*Triangle 2
		 ***
		  **
		   *
		*/
		
		System.out.println("Triangle 3 ");
		// for (init; condition; operation)
		for (int i = 0; i < 3 ; i++){			
			for (int j = 2; j >= 0 ; j--){      
				if (j<=i){
					System.out.print("*");
				} else {System.out.print(" ");}
			}
			System.out.println("");
		}
		/*Triangle 3
		   *
		  **
		 ***
		*/
		
		System.out.println("Triangle 4 ");
		// for (init; condition; operation)
		for (int i = 0; i < 3 ; i++){
			for (int j = 0; j < 3 ; j++){
				if (i <= j){
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		/*Triangle 4
		***
		**
		*
		*/

		System.out.println(" Finish! ");	
	}
}