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
		//char[] arrayConvChar = convertIntToChar(arrayToChar);
		printCh(convertIntToChar(arrayToChar));
		
		//3 task
		int a1 = 32;
		int b1 = 53;
		System.out.println("3 task: Max value from two values");
		System.out.println("a = " + a1 + ";  b = " + b1 + ";");
		System.out.println("Max int value is " + identifyMaxInt(a1,b1));
		
		//4 task
		int a2 = 52;
		int b2 = 33;
		int c2 = 43;
		System.out.println("4 task: Max value from three values");
		System.out.println("a = " + a2 + ";  b = " + b2 + ";  c = " + c2 + ";");
		System.out.println("Max int value of 3 is " + identifyMaxInt(a2,b2,c2));
		
		//5 task 
		int a3 = 64;
		int b3 = 84;
		int c3 = 17;
		int d3 = 72;
		int e3 = 32;
		System.out.println("5 task: Max value from five values");
		System.out.println("a = " + a3 + ";  b = " + b3 + ";  c = " + c3 + ";  d = " + d3 + ";  e = " + e3 + ";");
		System.out.println("Max int value of 5 is " + identifyMaxInt(a3,b3,c3,d3,e3));
		
		//6 task		
		char[] charToStr = {'C', 'a', 'M', 'p', 'U', 'S'};
		System.out.println("6 task: Pring char elements as String = "+ charMasToString(charToStr));
		
		//8 task
		int[] arrayMas = {83, 62, 77, 93, 106, 8435, 353, 123, 657, 111};
		int findElem = 106;
		System.out.println("8 task: Found int value " + findElem + " in masssive under index = "+ findElementInMassive(arrayMas, findElem));
		
		//9 task
		System.out.println("9 task: Found int value " + findElem + " in masssive under index from end massive (reversed) = "+ findElementInMassive(reverseMassiveInt(arrayMas), findElem));
		
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
		
		//14 task WRONG
		byte[] byteMas = {34, 43, 12, 94, 127, 34, 92, 94};
		System.out.println("14 task: check if next massive has duplicated byte values");
		printByte(byteMas);
		System.out.println("Result : " + ifDuplicateValuesHas(byteMas) );
		
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

	}
	
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
			System.out.println("int value [" +i+ "] = " + array[i] );
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
	
	static char[] convertIntToChar(int[] array){
		char[] arrayChar = new char[array.length];
		System.out.println("Int massive convert to Char with lenght = " + array.length);
		for(int i = 0; i < array.length ; i++){
			arrayChar[i] = (char) array[i];
		//	System.out.println("arrayChar[ " + i +"] = " + arrayChar[i] + "; ");
		}	
		return arrayChar;		
	}
	
	static int identifyMaxInt(int first, int second ){
		int max;
		if (first > second) {
			max = first;
		} else max = second;
		return max;			
	}
	
	static int identifyMaxInt(int first, int second , int third){
		int max = identifyMaxInt(first,second);
		max = identifyMaxInt(max,third);
		return max;			
	}
	
	static int identifyMaxInt(int first, int second, int third, int fourth, int fifth){
		int[] test = {first, second, third, fourth, fifth};
		int max=0;
		for(int i = 0; i < test.length  ; i++){
			max = identifyMaxInt(max, test[i]);
		}	
		return max;			
	}
	
	static String charMasToString(char[] array){
		String result = "";
		for(int i = 0; i < array.length ; i++){
			result = result + array[i]; 
		}	
		return result;
	}
	
	static int findElementInMassive(int[] array, int findElement){
		int result = -1;
		for(int i = 0; i < array.length ; i++){
			if (array[i] == findElement) {
				result = i;
			}			
		}	
		return result;
	}
	
	static int[] reverseMassiveInt(int[] array){
		int[] reverse = new int[array.length];
		for(int i = 0; i < array.length ; i++){
			reverse[i] = array[array.length -1 - i] ;						
		}	
		return reverse;
		
	}
	
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
	
	static int factorialOfInt(int intValue){
		int result = 1;
		for(int i = 1; i <= intValue ; i++){
			result = result * i;
		} 
		return result;			
	}
	
	static boolean ifYearLeap(int intValue){
		boolean result ;
		if ((intValue % 4) == 0) { 
			result = true;
		} else result = false;
		return result;			
	}
	
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
	
	static boolean ifDuplicateValuesHas(byte[] array){
		boolean result = false;
		for(int i = array.length - 1; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++) {
				if (array[j] == array[j+1] ) {
					result = true;
					//break;
				} 
			}
		}	
		return result;			
	}
	
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

}