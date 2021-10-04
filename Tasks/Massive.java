class Massive {

	public static void main (String[] args){
		//int[] array = new int[5];
		//int[] array = {1,2,6,7,9};
		int[] array = generateRandom(10);
		
		print(array);
	}
	
	static int[] generateRandom(int size){
		//create array
		int[] array = new int[size];
		// fill array
		for(int i = 0; i < array.length ; i++){
			int randomValue = (int)	(Math.random() * 100_000_000);	
			array[i] = randomValue;
			//System.out.println(randomValue);
		}
		//return array
		return array;
	}
	
	static void print(int[] array){
		//System.out.println(array);
		for(int i = 0; i < array.length ; i++){
			int value = array[i];
			System.out.println(i + " value " + value);
		}
	}

}