package MiniProje1;



public class MiniProje1 {
	
	public static void main(String[] args) {
		int number= 2;
		double remainder;
		
		if(number<2) {System.out.println("Geçersiz Sayı"); return; }
		if(number == 1) {System.out.println("Asal Değil");return;}
		
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
