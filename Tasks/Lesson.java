class Lesson {

	public static void main (String[] args){
		int a =1;
		int b =5;
		
		int count = sum(a, b);
		
		for (int i =0, i<count; i++){
			printHello();
		}
		/*int value =128;
		byte b = (byte) value;
		System.out.println(b);*/
		
		/*byte b1 = 10;
		byte b2 = 20;		
		byte b3 = (byte)b1 +b2;		
		System.out.println (b3);*/
		/*for (int i = 0; i < 3 ; i++){
			printHello();
		}
		System.out.println(" ");
		printHelloJohn();
		printHello("Yuriy", 5);
		printHello("Tolik");
		*/
	}
	
	static int sum(int first, int second){
		// int first = 1; int second = 5;
		int result = first + second;
		return result;
	}
	
	static void printHello() {
		System.out.print("Hello");

	}
	
	static void printHello(String name) {
		printHello() ;
		System.out.println(", " + name);
	
	}
	
	static void printHello(String name, int count) {
		for (int i=0; i< count; i++) {
		System.out.println("Hello, " + name);
		}
	}
	
	static void printHelloJohn() {
		printHello("John");
	}
	
}