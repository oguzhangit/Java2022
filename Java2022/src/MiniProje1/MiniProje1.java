package MiniProje1;



public class MiniProje1 {
	
	public static void main(String[] args) {
		int number= 13;
		double remainder;
		
		if(number<2) {System.err.println("Geçersiz Sayı");}
		
		boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			
			if (number % i == 0 ) {
				 isPrime = false;
			}
		
		}
	
		if (isPrime) {
			System.out.println("Asal");
		}else {
			System.out.println("Değil");
		}
	
	}

}
