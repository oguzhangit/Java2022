package MiniProje5;

public class MiniProje5 {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 543;
		
		boolean varMi = false;
		
		for (int sayi:sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("var");
		}else {
			System.out.println("Yok");
		}

	}

}
