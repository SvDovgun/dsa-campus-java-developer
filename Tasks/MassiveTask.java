class MassiveTask {

	public static void main (String[] args){
		//int[] array = new int[5];
		//int[] array = {1,2,6,7,9};
		//int[] array = generateRandom(10);
		
		//1 task
		char[] arrayChar = {'S','V','i','T', 'L', 'a', 'N', 'a'};		
		System.out.println("1 task: Massive of char(s) "); 
		printCh(arrayChar);
		
		//2 task
		int[] arrayToChar = {74,65,86,65};
		System.out.println("2 task: Massive of int to char(s) "); 
		//printIntToChar(arrayToChar);
		//char[] arrayConvChar = toCharArray(arrayToChar);
		printCh(toCharArray(arrayToChar));
		
		//3 task
		int a1 = 32;
		int b1 = 53;
		System.out.println("3 task: Max value from two values");
		System.out.println("a = " + a1 + ";  b = " + b1 + ";");
		System.out.println("Max int value is " + max(a1,b1));
		
		//4 task 
		int a2 = 52;
		int b2 = 33;
		int c2 = 43;
		System.out.println("4 task: Max value from three values");
		System.out.println("a = " + a2 + ";  b = " + b2 + ";  c = " + c2 + ";");
		System.out.println("Max int value of 3 is " + max(a2,b2,c2));
		
		//5 task 
		int a3 = 64;
		int b3 = 84;
		int c3 = 17;
		int d3 = 72;
		int e3 = 32;
		System.out.println("5 task: Max value from five values");
		System.out.println("a = " + a3 + ";  b = " + b3 + ";  c = " + c3 + ";  d = " + d3 + ";  e = " + e3 + ";");
		System.out.println("Max int value of 5 is " + max(a3,b3,c3,d3,e3));
		
		//6 task		
		char[] charToStr = {'C', 'a', 'M', 'p', 'U', 'S'};
		System.out.println("6 task: Pring char elements as String = "+ charMasToString(charToStr));
		
		//8 task
		int[] arrayMas = {83, 62, 77, 93, 106, 8435, 353, 123, 657, 111};
		int findElem = 106;
		System.out.println("8 task: Found int value " + findElem + " in masssive under index = "+ indexOf(arrayMas, findElem));
		
		//9 task
		System.out.println("9 task: Found int value " + findElem + " in masssive under index from end massive (reversed) = "+ indexOf(reverseMassiveInt(arrayMas), findElem));
		
		//10 task
		int intForFactorial = 7;
		System.out.println("10 task: factorial for " + intForFactorial + " = " + factorialOfInt(intForFactorial));
		
		//11 task
		int year = 2021;
		System.out.println("11 task: Is " + year + " the leap year? Answer: " + ifYearLeap(year));
		
		//12 task
		int[] massiveInt = {463, 473, 27, 4684,16, 400, 403};
		System.out.println("12 task: have next massive int(s)"); 
		printInt(massiveInt);
		int aliquotValue = 4;
		System.out.println(" Next value from defined massive are aliquot for defined " + aliquotValue + " : " + aliquotValues(massiveInt, aliquotValue));
		System.out.println();
		
		//13 task
		int[] intToSort = {2543, 463, 473, 27, 484,165, 400, 403, 23};
		System.out.println("13 task: Sort next massive by asc");
		printInt(intToSort);
		System.out.println("Below massive after sorted by ASC: ");
		printInt(sortedMassiveIntAsc(intToSort));
		
		//14 task
		byte[] byteMas = {34, 43, 12, 94, 127, 34, 92, 94};
		System.out.println("14 task: check if next massive has duplicated byte values");
		printByte(byteMas);
		System.out.println("Result : " + byteArrayMethod(byteMas) );
		
		//15 task
		int[] intMas1 = {1, 2, 3, 4, 5 };
		int[] intMas2 = {11, 22, 33, 44, 50 };
		System.out.println("15 task: Lts multiply next few massive (their size are equal) : ");
		System.out.println("Massive 1:");
		printInt(intMas1);
		System.out.println("Massive 2:");
		printInt(intMas2);
		System.out.println("Result Massive:");
		printInt(intMultiplyMass(intMas1, intMas2));
		
		//16 task
		//check each element of first massive in second massive and collect to 3 massive
		
		//17 task
		System.out.println("17 task: Input massive");
		int[] arrayMas3 = {83, 62, 77, 93, 106, 8435, 353, 123, 657, 111};
		printInt(arrayMas3);		
		System.out.println("     Reversed Massive ");
		printInt(reverseMassiveInt(arrayMas3));
		
		//18 task
		System.out.println("18 task: Random Array with parameters");
		printInt(randomArray(7, 25, 250));
		
		//19 task
		// "hello" "ll" => true
		// "hello" "eo" => false


		//20 task
		System.out.println("20 task: Two-dimensional array for sumDiagonal");
		int[][] twoIntArray = new int[4][];
		twoIntArray[0] = new int[] {11,2,3,4};
		twoIntArray[1] = new int[] {4,5,1,1};
		twoIntArray[2] = new int[] {6,7,8,9};
		twoIntArray[3] = new int[] {1,4,7,2};
		printArray(twoIntArray);
		System.out.println("Sum of Diagonals are equel " + sumDiagonal(twoIntArray));

		//21 task
		System.out.println("21 task: Two-dimensional array of longs and two-dimensional array of booleans");
		System.out.println("get array of longs from position where booleans array has true");
		long[][] twoLongArray = new long[4][];
		twoLongArray[0] = new long[] {74,84,65,86};
		twoLongArray[1] = new long[] {79,82,65,87};
		twoLongArray[2] = new long[] {74,83,86,79};
		twoLongArray[3] = new long[] {65,88,72,82};
		boolean[][] twoBooleanArray = new boolean[4][];
		twoBooleanArray[0] = new boolean[] {true,false,false,false};
		twoBooleanArray[1] = new boolean[] {false,false,true,false};
		twoBooleanArray[2] = new boolean[] {false,true,false,false};
		twoBooleanArray[3] = new boolean[] {true,false,false,false};
		printLong(getTrueLong(twoLongArray,twoBooleanArray));


		//22 task 
		System.out.println("22 task: Println two-dimensional array");
		char[][] twoChArray = {{'S',118,105,116,65 },{103, 111},{74,65,86,'A'}};
		printArray(twoChArray);

	}
	
	// 1 task
	static void printCh(char[] array){
		System.out.println("Char massive with lenght = " + array.length);
		for(int i = 0; i < array.length ; i++){
			char value = array[i];
			System.out.println("char[" + i +"] = " + value + "; ");
		}		
	}
	
	static void printInt(int[] array){
		//System.out.println("Int massive with lenght = " + array.length);
		for(int i = 0; i < array.length ; i++){
			System.out.println("int value [" +i+ "] = " + array[i] );
		}		
	}
	
	static void printByte(byte[] array){
		//System.out.println("Int massive with lenght = " + array.length);
		for(int i = 0; i < array.length ; i++){
			System.out.println("byte value [" +i+ "] = " + array[i] );
		}		
	}

	static void printLong(long[] array){
		//System.out.println("Long massive with lenght = " + array.length);
		for(int i = 0; i < array.length ; i++){
			long value = array[i];
			System.out.println("long[" + i +"] = " + value + "; ");
		}		
	}
	
	/*static void printIntToChar(int[] array){
		System.out.println("Int massive convert to Char with lenght = " + array.length);
		for(int i = 0; i < array.length ; i++){
			int valueInt = array[i]; 
			char value = (char )array[i];
			System.out.println("int value " + valueInt +" = " + value + "; ");
		}		
	}*/
	
	// 2 task
	static char[] toCharArray(int[] array){
		char[] arrayChar = new char[array.length];
		System.out.println("Int massive convert to Char with lenght = " + array.length);
		for(int i = 0; i < array.length ; i++){
			arrayChar[i] = (char) array[i];
		//	System.out.println("arrayChar[ " + i +"] = " + arrayChar[i] + "; ");
		}	
		return arrayChar;		
	}
	
	// 3 task 
	static int max(int first, int second ){
		int max = first >= second ? first : second ;
		//if (first > second) {
		//	max = first;
		//} else max = second;
		return max;	
		//  return first > second ? first : second ;
	}
	
	// 4 task
	static int max(int first, int second , int third){
		return max(max(first,second),third);			
	}
	
	// 5 task
	static int max(int first, int second, int third, int fourth, int fifth){
		/*int[] test = {first, second, third, fourth, fifth};
		int max=0;
		for(int i = 0; i < test.length  ; i++){
			max = max(max, test[i]);
		}	
		return max;	*/
		return max(max(max(first,second),max(third,fourth)), fifth );		
	}
	
	// 6 task
	static String charMasToString(char[] array){
		String result = "";
		for(int i = 0; i < array.length ; i++){
			result = result + array[i]; 
		}	
		return result;
	}
	
	// 8 task  + 9 task(after reverse)
	static int indexOf(int[] array, int findElement){
		int result = -1;
		for(int i = 0; i < array.length ; i++){
			if (array[i] == findElement) {
				result = i;
			}			
		}	
		return result;
	}
	
	// 17 task + for 9 task
	static int[] reverseMassiveInt(int[] array){
		int[] reverse = new int[array.length];
		for(int i = 0; i < array.length ; i++){
			reverse[i] = array[array.length -1 - i] ;						
		}	
		return reverse;
		
	}
	
	
	// 10 task
	static int factorialOfInt(int intValue){
		int result = 1;
		for(int i = 1; i <= intValue ; i++){
			result = result * i;
		} 
		return result;			
	}
	
	// 11 task , add validation?
	static boolean ifYearLeap(int intValue){ // 400 or 100 ?
		boolean result ;
		if ((intValue % 4) == 0) { 
			result = true;
		} else result = false;
		return result;			
	}
	
	// 12 task 
	static String aliquotValues(int[] array, int aliquotValue){
		String result = "";
		for(int i = 0; i < array.length ; i++){
			if (array[i] % aliquotValue == 0 ) {
				result = result + array[i] + "; "; 
				//System.out.print(array[i] + " ");
			}			 
		}	
		System.out.println();
		return result;
	}
	
	//13 task
	static int[] sortedMassiveIntAsc(int[] array){
		for(int i = array.length - 1; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++) {
				if (array[j] > array[j+1] ) {
					int tmp = array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
			}
		}	
		return array;
		
	}

	//14 task
	static boolean byteArrayMethod(byte[] array){
		boolean result = false;
		for(int i = 0; i < array.length ; i++){
			for(int j = i+1 ; j < array.length - 1 ; j++) {
				if (array[i] == array[j] ) {
					result = true;
					System.out.println("Find duplicated element  " + array[i]);
					break;
				} 
			}
		}	
		return result;			
	}
	
	//15 task
	static int[] intMultiplyMass(int[] array1, int[] array2){
		int[] array = new int[array1.length];
		if (array1.length != array2.length){
			System.out.println("Info: Incorrect length of massives");
		}

		for(int i = 0; i < array.length ; i++){
			array[i] = array1[i] * array2[i];
		//	System.out.println("arrayChar[ " + i +"] = " + arrayChar[i] + "; ");
		}	
		return array;		
	}

	// 18 task
	static int[] randomArray(int length, int lowerBorder, int upperBorder){
		int[] array = new int[length];
		
		for(int i = 0; i < length ; i++){
			array[i] = lowerBorder + (int) (Math.random() * upperBorder);
			//System.out.println("arrayRandom[ " + i +"] = " + array[i] + "; ");
		}	
		return array;		
	}

	//21 task
	static void printArray(int[][] array){		
		for (int i = 0 ; i < array.length ; i++){			
			for (int j = 0 ; j < array[i].length ; j++){
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println("");
		}
	}
	//20 task
	static int sumDiagonal(int[][] array){	
		int sum = 0;
		for (int i = 0 ; i < array.length ; i++){
			for (int j = 0 ; j < array[i].length ; j++){
				if (i == j) {
					sum += array[i][j];
				}
				if (array[j].length-1-i  == j ) {
				//	System.out.println("to sum i=" +i + "  j="+j+ "  value=" + array[i][j] + " ");
					sum += array[i][j];
				}
			}
		}
		return sum;
	}
	//21 task
	static long[] getTrueLong(long[][] twoLongArray, boolean[][] twoBooleanArray){	
		int length = 0;
		for (int i = 0 ; i < twoBooleanArray.length ; i++){
			for (int j = 0 ; j < twoBooleanArray[i].length ; j++){
				if (twoBooleanArray[i][j]) {
					length++;
				}				
			}
		}

		System.out.println(" length = " + length + " ");

		long[] array = new long[length];
		int arrayIndex=0;

		for (int i = 0 ; i < twoBooleanArray.length ; i++){
			for (int j = 0 ; j < twoBooleanArray[i].length ; j++){
				if (twoBooleanArray[i][j]) {
					array[arrayIndex] = twoLongArray[i][j];
					arrayIndex++;
				}				
			}
		}
		

		return array;
	}
	//22 task 
	static void printArray(char[][] array){
		//for (char[] row1: array){
		for (int i = 0 ; i < array.length ; i++){
			//for (char column: row1){
			for (int j = 0 ; j < array[i].length ; j++){
				System.out.print(" " + array[i][j] + " ");
			}
			System.out.println("");
		}
	}

}