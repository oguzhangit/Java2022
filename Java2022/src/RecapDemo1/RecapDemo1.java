package RecapDemo1;

public class RecapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1 = 50;
		int sayi2 = 60;
		int sayi3 = 5;
		int enBuyuk = sayi1;
		
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}else if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük =  " + enBuyuk);
	}

}
