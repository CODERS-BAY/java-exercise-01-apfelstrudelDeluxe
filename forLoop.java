public class forLoop {
	
	public static void main (String[] args) {
		/* FOR loop 
	
		int i = 0;
		int j = i++;
		System.out.println(j); // j = i + 1 = 0 erste Runde ist 0
		
		int a = 0;
		int b = ++i;
		System.out.println(b); // b = 1 + a = 1 erste Runde ist 1
		
	*/
		
		String a = "Super ";
		String b = "Kurs";
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(a + b + i);
		
		}
		
		
		
		
		
	//WHILE LOOP	
		
		
		boolean iterator = true;
		
		int counter = 0;
		while(iterator) {
			System.out.println(counter++);
		
			if(counter == 100) {
				iterator = false;
	}

}
}
}

